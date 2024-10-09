public class CaseEmpty implements Case {
    @Override
    public void event(Personnage personnage) {
        System.out.println("This room is empty");
    }
}
