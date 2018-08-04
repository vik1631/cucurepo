package manager;

import testUtils.PropertyReader;

public class FileReaderManager {
	
	private static FileReaderManager filereader=new FileReaderManager();
	
	private PropertyReader configReader;
	private FileReaderManager(){
		
	}
	
	public static FileReaderManager getInstance(){
		return filereader;	
		
	}
	
	public PropertyReader getConfig(){
		return (configReader==null)? configReader=new PropertyReader():configReader;

	}

}
