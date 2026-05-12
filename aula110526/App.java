public class App {
    public static void main(String[] args) throws Exception {
   



  ArrayList<Forma2D> ListaFormas = new ArrayList<>();
  int option = 0;
  MenuFormas menuFormas = new MenuFormas();
 do{
    option = menuFormas.exibirMenu();
    switch (option) {
        case 1:
           ListaFormas.add(menuFormas.cadastraForma2D());
           break;
        case 2:
           for (Forma2D forma2d : ListaFormas) {
            System.out.println(forma2d.toString());
           }
        case 3:
           for(Forma2D forma2d : ListaFormas) {
            System.out.println("Area de Forma" + forma2d.getNome() + 
                            ":" + forma2d.area());          
           }
       break;
    default:
       break;
}while(option != 0);
menuFormas.encerraSistema();

    }
}