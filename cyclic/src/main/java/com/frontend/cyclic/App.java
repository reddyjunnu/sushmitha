package com.frontend.cyclic;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	FileSystemResource fileSystemResource = new FileSystemResource("./src/main/java/Bean.xml");
    	BeanFactory factory = new XmlBeanFactory(fileSystemResource);
    	
        A obj =factory.getBean("aref",A.class);
    	obj.show();   	
    	
    }
}