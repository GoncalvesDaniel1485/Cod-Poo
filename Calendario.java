public class Calendario{
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int mes){
        switch(mes){
            case 1:  return "Janeiro";
            case 2:  return "Fevereiro";
            case 3:  return "Março";
            case 4:  return "Abril";
            case 5:  return "Maio";
            case 6:  return "Junho";
            case 7:  return "Julho";
            case 8:  return "Agosto";
            case 9:  return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês não existe";
        }
    }

    public void mostrarData(){
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }

    public void anoBissexto(){
        if(ano % 4 == 0){
            System.out.println(ano + " é bissexto.");
        }
        else{
            System.out.println(ano + " não é bissexto.");
        }
    }
}