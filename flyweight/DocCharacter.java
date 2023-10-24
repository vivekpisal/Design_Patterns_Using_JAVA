package flyweight;

public class DocCharacter implements ILetter
{
	private int size;
	private String font;
	private char letter;	
	
	public DocCharacter(int size, String font, char letter) {
		super();
		this.size = size;
		this.font = font;
		this.letter = letter;
	}
	public int getSize() {
		return size;
	}
	public String getFont() {
		return font;
	}
	public char getLetter() {
		return letter;
	}
	
	@Override
	public void display(int row, int col) {
		// TODO Auto-generated method stub
		
	}
}
