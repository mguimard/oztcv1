package ozt.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.OptionalInt;
import java.util.function.BiPredicate;

public class PathsAPI {
	
	public static void main(String[] args) throws IOException {		
		System.out.println(Paths.get("/a/b/c/").getFileName());
		
		Files.readAllLines(Paths.get("/tmp/ozt/../ozt/fichier.txt"));
		System.out.println(Paths.get("/a/././././././b/../c").normalize());		
	}
	
	public static void main9(String[] args) throws IOException {
		System.out.println(Files.readAllLines(Paths.get("/tmp/ozt/fichier.txt")).size());
		System.out.println(Files.readAllLines(Paths.get("/tmp/ozt/fichier.txt")).size());
		System.out.println(Files.readAllLines(Paths.get("/tmp/ozt/fichier.txt")).size());
		System.out.println(Files.readAllLines(Paths.get("/tmp/ozt/fichier.txt")).size());
	}

	public static void main8(String[] args) {		
		System.out.println(Paths.get("/A/B/C/D").getName(2)); // ?		
		System.out.println(System.getProperty("user.home")); // ?		
		System.out.println(Paths.get("folder1/folder2/fichier.txt"));
		System.out.println(Paths.get("folder1/folder2/fichier.txt").toAbsolutePath()); // cwd + path.toString()

	}
	
	public static void main7(String[] args) throws IOException {
		Files.createDirectories(Paths.get("/tmp/ozt/A/B"));
		
	}
	
	public static void main6(String[] args) throws IOException {		
		// file already exists exception !!!!
		Files.copy(Paths.get("/tmp/ozt/fichier-link"), Paths.get("/tmp/ozt/copy.txt"));
		Files.delete(Paths.get("/tmp/ozt/fichier-link"));
		
		
	}
	
	public static void main5(String[] args) {		
		File f = Paths.get("whatever").toFile();
		Path p = f.toPath();		
	}
	
	public static void main4(String[] args) throws IOException {

		try (var r = Files.newBufferedReader(Paths.get("/tmp/ozt/fichier.txt"))) {
			r.lines().forEach(System.out::println); // tout lu
			r.lines().forEach(System.out::println); // vide
			
			
			// r.close();
		}
		
		try (var r = Files.newBufferedReader(Paths.get("/tmp/ozt/fichier.txt"))) {
			System.out.println(r.readLine()); // hello
			System.out.println(r.readLine()); //
			System.out.println(r.readLine());
			System.out.println(r.readLine());
		}
	}

	public static void main3(String[] args) throws IOException {

		Path rootFolder = Paths.get("/tmp/ozt");
		BasicFileAttributes a;

		// /tmp/ozt/.txt

		// Path.endsWith VS String.endsWith
		BiPredicate<Path, BasicFileAttributes> checkTxtFile = (p, attrs) -> p.toString().endsWith(".txt");
		long count = Files.find(rootFolder, 256346584, checkTxtFile).count();

		System.out.println(count); // ?

		count = Files.walk(rootFolder, 5643254).filter(p -> p.toString().endsWith(".txt")).count();

		System.out.println(count);

	}

	public static void main2(String[] args) {
		Path p = Paths.get("/tmp/ozt/fichier.txt");
		File f = p.toFile();
		System.out.println(f);

		Path p2 = Paths.get("/A/B/C/D");
		Path p3 = Paths.get("/A/B/E/F");

		// System.out.println(p2.subpath(1, 36542514)); // boom

		// windows subtilité : si les disques sont différents entre p2 et p3 ca fait boom
		System.out.println(p2.relativize(p3)); // cd "../../E/F"
		System.out.println(p3.relativize(p2));

		System.out.println(p3.getNameCount()); // ?
	}
}
