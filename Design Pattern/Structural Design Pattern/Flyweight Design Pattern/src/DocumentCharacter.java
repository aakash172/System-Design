public class DocumentCharacter implements ILetter{

    private char character;
    private String fontType;
    int size;
    DocumentCharacter(char character,String fontType,int size){
        /* Intrinsic Data */
        this.character=character;
        this.fontType=fontType;
        this.size=size;
    }

    @Override
    public void display(int row, int column) {
        System.out.println("Displaying '"+character+"' with size ="+size+" ,fontType= "+fontType+" at location [ "+row +" , "+column+" ]");
    }
}
