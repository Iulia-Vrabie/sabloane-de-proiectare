import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
	String url;

	public Image(String imageName) {
		this.url = imageName;
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void print() {
		System.out.println("Image with name: " + this.url);
	}

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public String url() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension dim() {
		// TODO Auto-generated method stub
		return null;
	}

	public PictureContent content() {
		// TODO Auto-generated method stub
		return null;
	}

	
}