public class Image implements Element{
	String url;

	public Image(String imageName) {
		this.url = imageName;
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
}
