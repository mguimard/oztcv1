package ozt.texts;

public class Blocks {
	public static void main(String[] args) {
		String json = """
				{
				  "name": "Alice",
				  "age": 30
				}
				""";

		System.out.println(json);

		String html = """
				<html>
				    <body>
				        <h1>Hello %s</h1>
				    </body>
				</html>
				""".formatted("Alice");

		System.out.println(html);

		String textBlockInAtextBlock = """
				
				String myString = \"\"\"
				  <html>
								<body>
				        <h1>Hello %s</h1>
				    </body>
				</html>
				\"\"\";
				
				""";
		
		System.out.println(textBlockInAtextBlock.stripIndent());
	}
}
