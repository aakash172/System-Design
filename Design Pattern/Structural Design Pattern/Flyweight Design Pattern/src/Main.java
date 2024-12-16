public class Main {
    public static void main(String[] args) {
        ILetter obj1= LetterFactory.getILetter('x',"Arial",10);
        obj1.display(10,20);
        obj1.display(15,20);

        ILetter obj2= LetterFactory.getILetter('u',"Arial",10);
        obj2.display(18,20);
    }
}