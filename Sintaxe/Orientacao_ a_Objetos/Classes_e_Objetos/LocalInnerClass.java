public class LocalInnerClass { 
    private int data = 30; 
/* 
    public class Main {
        retorno nomeDaFuncao() {
            class NomeDaClasse {
                retorno nomeDoMetodo() { codigo; }
            }
            nomeDaClasse i = new nomeDaClasse();
        }    
    }
        public static void main(String[] args) {
            MainClass m = new MainClass();
            m.nomeDoMetodo();
        }
    }
*/
    public void display() {  
        class Local {  
            void mensagem(){ System.out.println(data); }  
        }  
        // é necessário instanciar a classe local depois de criar
        Local l = new Local();  
        l.mensagem();  
    }  
    public static void main(String args[]) {  
        // instanciando a classe para poder usar .display();
        LocalInnerClass obj = new LocalInnerClass();  
        obj.display();  
    }    
}
