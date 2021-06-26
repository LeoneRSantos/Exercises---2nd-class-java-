// Leone Rodrigues Santos, 26/06/21

// OOP 

public class Student {

    // Attributes
    
    String nome;
    Float matricula;
    Float nota;

    // Builders

    Student(){

    }

    Student(String nome){
        this.nome = nome;
    }

    Student(String nome, Float matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    Student(String nome, Float matricula, Float nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
}

