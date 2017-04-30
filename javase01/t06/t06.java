import java.util.Scanner;
public class t06 {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.addNote(new Note("abc"));
        nb.addNote(new Note("dfg"));
        nb.addNote(new Note("hbo"));
        System.out.println("3 notes added:");
        nb.getNotes();
        nb.editNote(2,"qwe");
        System.out.println("Second note edited:");
        nb.getNotes();
        System.out.println("First note deleted:");
        nb.deleteNote(1);
        nb.getNotes();
    }
}

class Note{
    private String text;
    public Note(String s){
        this.text = s;
    }
    public String getNote(){
        return this.text;
    }
    public Note editNote(String s){
        this.text = s;
        return this;
    }
}

class Notebook{
    private static int n = 2;
    private static int i = 0;
    private static Note Notes[] = new Note[n];
    public void addNote(Note n){
        if (this.i==this.n){
            this.n=this.i*this.n;
            Note a[] = new Note[this.n];
            for(int i=0;i<this.n/this.i;i++){
                a[i]=this.Notes[i];
            }
            this.Notes=a;
        }
        Notes[this.i]=n;
        this.i++;
    }
    public void getNotes(){
        for(int i=0;i<this.i;i++){
            System.out.println((i+1)+" note: "+this.Notes[i].getNote());
        }
    }
    public void editNote(int n,String s){
        this.Notes[n-1].editNote(s);
    }
    public void deleteNote(int n){
        for(int i=n-1;i<this.i;i++){
            this.Notes[i]=this.Notes[i+1];
        }
        i--;
    }
}