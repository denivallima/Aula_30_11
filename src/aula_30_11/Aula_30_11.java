
package aula_30_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Aula_30_11 {

        public static void main(String[] args) {
       
            Aluno a1 = new Aluno("Maira", 25);
            Aluno a2 = new Aluno("Maira", 25);
            Aluno a3 = new Aluno("Maira", 25);
            
            
            List<Aluno> listAluno = new ArrayList<>();
//            listAluno.add(a1); 
//            listAluno.add(a2);
//            listAluno.add(a3);
        listAluno.addAll(Arrays.asList(a1, a2, a3));
        
//            for (Aluno Listaluno1 : listAluno) {
//                System.out.println(Listaluno1.getNone()
//                + "\n" + Listaluno1.getIdade()
//                );
                
                Set<Aluno> listAlunoSet = new HashSet<>();
                  listAlunoSet.add(a1); 
                  listAlunoSet.add(a2);
                  listAlunoSet.add(a3);
                
              for (Aluno ListalunoSet1 : listAlunoSet) {
                System.out.println(ListalunoSet1.getNone());
            }
              
              

        }
    
}
