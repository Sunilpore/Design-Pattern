package creational_pattern.factory_pattern;

public class OperatingSystemFactory {

    public OS getInstanceOS(String os){

        if(os == null && os.equals("")){
            return null;
        }

        else if(os.equals("Open"))
            return new Android();
        else if(os.equals("Close"))
            return new IOS();
        else
            return new Windows();
    }


}
