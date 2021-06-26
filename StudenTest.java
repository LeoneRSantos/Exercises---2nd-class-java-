// Leone Rodrigues Santos, 26/06/21

// OOP

public class StudenTest {
    
    public static void main(String[] args) {

        // default builder

        Student s1 = new Student();         

        s1.nome = "Aluno 1";
        s1.matricula = 0.322f;
        s1.nota = 8.44f;

        // two-parameter constructor 

        Student s2 = new Student("Aluno 2", 0.323f);
        s2.nota = 8.22f;

        // three-parameter constructor

        Student s3 = new Student("Aluno 3", 0.324f, 7.88f);

        // Print all of them

        // 01

        System.out.printf("\nNome: " + s1.nome + "\nMatricula: " + s1.matricula + "\nNota: " + s1.nota + "\n");

        // 02

        System.out.printf("\nNome: " + s2.nome + "\nMatricula: " + s2.matricula + "\nNota: " + s2.nota + "\n");

        // 03

        System.out.printf("\nNome: " + s3.nome + "\nMatricula: " + s3.matricula + "\nNota: " + s3.nota + "\n");







        
    }
}
