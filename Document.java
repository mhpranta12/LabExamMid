
public class Document {
				String a;
				String t;
				int n=0;
				
				public Document(String a, String t) {
					super();
					this.a = a;
					this.t = t;
				}
				public Document() {
					super();
				}
				@Override
				public String toString() {
					return "Document [a=" + a + ", t=" + t + "]";
				}
				void createCopies (int n)
				{
					this.n=this.n+n;
					
				}
				void sellCopies (int n)
				{
					
					if (n>this.n)
					{
						System.out.println("Number of available copies = 0");
					}
					else 
						this.n=this.n-n;
				}
				String getAuthor()
				{
					return a;
				}
				String getTitle()
				{
					return t;
				}
				int getCopies()
				{
					return n;
				}
				
}
