package academy.devdojo.maratonajava.praticando.associacao.universidadesystem;

public class Service {
    public static void main(String[] args) {

        Universidade uni = new Universidade("Uni DevDojo", "Itajubá");

        Curso javaCurso = new Curso("Java", 2);
        Curso csharpCurso = new Curso("C#", 1);
        Curso springCurso = new Curso("SpringBoot", 1);
        Curso phytonCurso = new Curso("Python", 1);

        Professor prof1 = new Professor("Dojo", "Javeiro");
        Professor prof2 = new Professor("Dojo", "C#arpeiro");
        Professor prof3 = new Professor("William", "Springueiro");
        Professor prof4 = new Professor("João", "Phytanzo");

        Sala sala1 = new Sala(1, 1);
        Sala sala2 = new Sala(2, 2);
        Sala sala3 = new Sala(3, 3);
        Sala sala4 = new Sala(4, 4);

        Aluno aluno1 = new Aluno("João zika", 8656);
        Aluno aluno2 = new Aluno("Ana Silva", 1234);
        Aluno aluno3 = new Aluno("Carlos Souza", 5678);
        Aluno aluno4 = new Aluno("Maria Oliveira", 9101);
        Aluno aluno5 = new Aluno("Pedro Santos", 1121);
        Aluno aluno6 = new Aluno("Lucas Lima", 3141);
        Aluno aluno7 = new Aluno("Fernanda Costa", 5161);
        Aluno aluno8 = new Aluno("Rafael Mendes", 7181);
        Aluno aluno9 = new Aluno("Juliana Rocha", 9202);
        Aluno aluno10 = new Aluno("João Abudabi", 8657);
        Aluno aluno11 = new Aluno("Camila Ferreira", 3344);
        Aluno aluno12 = new Aluno("Diego Alves", 5566);
        Aluno aluno13 = new Aluno("Eduarda Martins", 7788);
        Aluno aluno14 = new Aluno("Felipe Ribeiro", 9900);
        Aluno aluno15 = new Aluno("Gabriela Nunes", 2233);
        Aluno aluno16 = new Aluno("Henrique Dias", 4455);
        Aluno aluno17 = new Aluno("Isabela Gomes", 6677);
        Aluno aluno18 = new Aluno("Julio Barbosa", 8899);
        Aluno aluno19 = new Aluno("Bruno Carvalho", 1122);
        Aluno aluno20 = new Aluno("Javali", 1168);
        Aluno aluno21 = new Aluno("Camila Feichas", 1232);

        // Settando tudo

        uni.setCursos(uni.getCursos());

        javaCurso.setProfessor(prof1);
        csharpCurso.setProfessor(prof2);
        springCurso.setProfessor(prof3);
        phytonCurso.setProfessor(prof4);

        javaCurso.setSala(sala1);
        csharpCurso.setSala(sala2);
        springCurso.setSala(sala3);
        phytonCurso.setSala(sala4);

        sala1.setNumero(sala1.getNumero());
        sala2.setNumero(sala2.getNumero());
        sala3.setNumero(sala3.getNumero());
        sala4.setNumero(sala4.getNumero());

        javaCurso.setAlunos(new Aluno[]{aluno1, aluno2, aluno3, aluno4, aluno5, aluno6});
        csharpCurso.setAlunos(new Aluno[]{aluno7, aluno8, aluno9, aluno10, aluno11, aluno12});
        springCurso.setAlunos(new Aluno[]{aluno13, aluno14, aluno15, aluno16, aluno17, aluno18});
        phytonCurso.setAlunos(new Aluno[]{aluno19, aluno20, aluno21});

        aluno1.setCurso(javaCurso);
        aluno2.setCurso(javaCurso);
        aluno3.setCurso(javaCurso);
        aluno4.setCurso(javaCurso);
        aluno5.setCurso(javaCurso);
        aluno6.setCurso(javaCurso);
        aluno7.setCurso(csharpCurso);
        aluno8.setCurso(csharpCurso);
        aluno9.setCurso(csharpCurso);
        aluno10.setCurso(csharpCurso);
        aluno11.setCurso(csharpCurso);
        aluno12.setCurso(csharpCurso);
        aluno13.setCurso(springCurso);
        aluno14.setCurso(springCurso);
        aluno15.setCurso(springCurso);
        aluno16.setCurso(springCurso);
        aluno17.setCurso(springCurso);
        aluno18.setCurso(springCurso);
        aluno19.setCurso(phytonCurso);
        aluno20.setCurso(phytonCurso);
        aluno21.setCurso(phytonCurso);

        javaCurso.setUniversidade(uni);
        csharpCurso.setUniversidade(uni);
        springCurso.setUniversidade(uni);
        phytonCurso.setUniversidade(uni);
        uni.setCursos(new Curso[]{javaCurso,csharpCurso,springCurso,phytonCurso});

        javaCurso.imprime();
        csharpCurso.imprime();
        springCurso.imprime();
        phytonCurso.imprime();
    }
}
