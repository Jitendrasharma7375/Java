import java.io.File;

public class CreateFolder {
    public static void createFolder(String baseFolder,int n)
    {
        File baseDir=new File(baseFolder);
        if(!baseDir.exists())
        {
            baseDir.mkdir();
        }
        for(int i=0;i<n;i++)
        {
            File folder=new File(baseFolder+"/virus "+i);
            folder.mkdir();
            createSubFolder(folder, n);
        }
    }
    
    public static void createSubFolder(File folder,int n)
    {

            for(int j=0;j<n;j++)
            {
                File subFolder=new File(folder.getPath()+"/Big virus "+j);
                subFolder.mkdirs();
            }
        
    }
    public static void main(String[] args) {

        String baseFolder="Virus";
        int n=5;
        createFolder(baseFolder,n);
    }
}
