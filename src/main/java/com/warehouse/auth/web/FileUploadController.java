package com.warehouse.auth.web;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.warehouse.auth.model.FileBucket;
import com.warehouse.auth.validator.FileValidator;

@Controller
public class FileUploadController {
 
    private static String UPLOAD_LOCATION="C:/mytemp/";
     
    @Autowired
    FileValidator fileValidator;
    
    @InitBinder("fileBucket")
    protected void initBinderFileBucket(WebDataBinder binder) {
       binder.setValidator(fileValidator);
    }
 
   
    @RequestMapping(value = "/scannedSerial", method = RequestMethod.GET)
    public String uploadScanndedSerialNO(Model model) {
    	
        //model.addAttribute("fileBucket", new FileBucket());
        System.out.println("Method Called : uploadScanndedSerialNO");

        return "fileUploadForm";
    }
    
    /**
	 * Upload single file using Spring Controller
	 */
/*	@RequestMapping(value = "/scannedSerial", method = RequestMethod.POST)
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				
				System.out.println("FILE BYTES " + bytes);

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();				

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
	}*/
 
 
    @RequestMapping(value = "/scannedSerial", method = RequestMethod.POST)
    public String submit(@RequestParam("file") final MultipartFile file, final ModelMap modelMap) {

    	System.out.println(" file uploaded");
        modelMap.addAttribute("file", file);
        System.out.println(" file uploaded" + file.getContentType());
        System.out.println(" file uploaded" + file.getName());
        System.out.println(" file uploaded" + file.getSize());
       // System.out.println(" file uploaded" + file.getBytes());
        return "fileUploadView";
    }
 /* @RequestMapping(value="/scannedSerial", method = RequestMethod.POST)
    public String singleFileUpload(@Valid FileBucket fileBucket, BindingResult result, ModelMap model) throws IOException {
 
        if (result.hasErrors()) {
            System.out.println("validation errors");
            return "singleFileUploader";
        } else if(fileBucket.getFileName() != null && !"".equals(fileBucket.getFileName())) {
        	return "success";
        } else {            
            System.out.println("Fetching file");
            MultipartFile multipartFile = fileBucket.getFile();
 
            //Now do something with file...
            FileCopyUtils.copy(fileBucket.getFile().getBytes(), new File(UPLOAD_LOCATION + fileBucket.getFile().getOriginalFilename()));
             
            //String fileName = multipartFile.getOriginalFilename();
            
            System.out.println("Fetching file Name" + multipartFile.getOriginalFilename());
            System.out.println("Fetching file Name 1 " + fileBucket.getFile().getBytes());
            //model.addAttribute("fileName", fileName);
            return "success";
        }
    }  */   
}
