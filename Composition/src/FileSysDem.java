public class FileSysDem {
    public static void main(String[] args) {
        // Root folder
        Folder root = new Folder("php_demo1");

        // adding the Source Files folder and its sub folders and files
        Folder sourceFiles = new Folder("Source Files");
        sourceFiles.addFolder(new Folder(".phalcon"));

        Folder app = new Folder("app");
        app.addFolder(new Folder("config"));
        app.addFolder(new Folder("controllers"));
        app.addFolder(new Folder("library"));
        app.addFolder(new Folder("migrations"));
        app.addFolder(new Folder("models"));
        app.addFolder(new Folder("views"));

        sourceFiles.addFolder(app);
        sourceFiles.addFolder(new Folder("cache"));

        Folder publicFolder = new Folder("public");
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));

        sourceFiles.addFolder(publicFolder);

        // Adding Source Files folder to root folder
        root.addFolder(sourceFiles);


        root.addFolder(new Folder("Include Path"));
        root.addFolder(new Folder("Remote Files"));

        // Now printing out the initial structure
        System.out.println("Initial Structure:");
        root.print("");

        // Delete the 'app' folder and printing the structure
        sourceFiles.removeFolder("app");
        System.out.println("\nAfter deleting 'app' folder:");
        root.print("");

        // Delete the 'public' folder and printing the structure
        sourceFiles.removeFolder("public");
        System.out.println("\nAfter deleting 'public' folder:");
        root.print("");
    }
}