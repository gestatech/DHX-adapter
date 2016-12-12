package ee.ria.dhx.server.service;

import ee.ria.dhx.exception.DhxException;
import ee.ria.dhx.exception.DhxExceptionEnum;
import ee.ria.dhx.server.persistence.entity.Folder;
import ee.ria.dhx.server.persistence.entity.Organisation;
import ee.ria.dhx.server.persistence.repository.DocumentRepository;
import ee.ria.dhx.server.persistence.repository.FolderRepository;
import ee.ria.dhx.server.persistence.repository.OrganisationRepository;
import ee.ria.dhx.server.persistence.repository.RecipientRepository;
import ee.ria.dhx.server.service.util.WsUtil;
import ee.ria.dhx.types.InternalXroadMember;
import ee.ria.dhx.util.FileUtil;
import ee.ria.dhx.ws.config.CapsuleConfig;
import ee.ria.dhx.ws.service.AddressService;
import ee.ria.dhx.ws.service.AsyncDhxPackageService;
import ee.ria.dhx.ws.service.DhxMarshallerService;
import ee.ria.dhx.ws.service.DhxPackageProviderService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.zip.GZIPOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 * Class for converting between SOAP objects and Database obejcts.
 * 
 * @author Aleksei Kokarev
 *
 */

@Slf4j
@Service
public class ConvertationService {

  @Autowired
  DhxMarshallerService dhxMarshallerService;

  /**
   * Creates dataHandler from object. Object will be marshalled, GZipped, base64 encoded and written
   * to file. Datahandler will be created from that file.
   * 
   * @param obj - object to create dataHandler for
   * @return
   * @throws DhxException
   */
  public DataHandler createDatahandlerFromObject(Object obj) throws DhxException {
    FileOutputStream fos = null;
    GZIPOutputStream zippedStream = null;
    OutputStream base64Stream = null;
    try {
      File file = FileUtil.createPipelineFile();
      fos = new FileOutputStream(file);
      base64Stream = WsUtil.getBase64EncodeStream(fos);
      zippedStream = WsUtil.getGZipCompressStream(base64Stream);
      dhxMarshallerService.marshallToOutputStreamNoNamespacePrefixes(obj, zippedStream);
      zippedStream.finish();
      base64Stream.flush();
      fos.flush();
      DataSource datasource = new FileDataSource(file);
      return new DataHandler(datasource);
    } catch (IOException ex) {
      throw new DhxException(DhxExceptionEnum.FILE_ERROR,
          "Error occured while creating attachment for response. " + ex.getMessage(), ex);
    } finally {
      FileUtil.safeCloseStream(base64Stream);
      FileUtil.safeCloseStream(zippedStream);
      FileUtil.safeCloseStream(fos);
    }
  }

  /**
   * Creates dataHandler from list of objects. Objects will be marshalled, GZipped, base64 encoded
   * and written to file. Datahandler will be created from that file. All objects are written to
   * same file one after another.
   * 
   * @param objList - list of objects to create dataHandler for
   * @return
   * @throws DhxException
   */
  public DataHandler createDatahandlerFromList(List<? extends Object> objList)
      throws DhxException {
    FileOutputStream fos = null;
    GZIPOutputStream zippedStream = null;
    OutputStream base64Stream = null;
    try {
      File file = FileUtil.createPipelineFile();
      fos = new FileOutputStream(file);
      base64Stream = WsUtil.getBase64EncodeStream(fos);
      zippedStream = WsUtil.getGZipCompressStream(base64Stream);
      for (Object obj : objList) {
        dhxMarshallerService.marshallToOutputStreamNoNamespacePrefixes(obj, zippedStream);
      }
      zippedStream.finish();
      base64Stream.flush();
      fos.flush();
      DataSource datasource = new FileDataSource(file);
      return new DataHandler(datasource);
    } catch (IOException ex) {
      throw new DhxException(DhxExceptionEnum.FILE_ERROR,
          "Error occured while creating attachment for response. " + ex.getMessage(), ex);
    } finally {
      FileUtil.safeCloseStream(base64Stream);
      FileUtil.safeCloseStream(zippedStream);
      FileUtil.safeCloseStream(fos);
    }
  }
}