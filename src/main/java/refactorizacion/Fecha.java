package refactorizacion;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        return esDiaValido() && esMesValido() && esAnioValido();
    }

    private boolean esDiaValido() {
        return dia >= 1 && dia <= getDiasMes();
    }

    private boolean esMesValido() {
        return mes >= 1 && mes <= 12;
    }

    private boolean esAnioValido() {
        return anio >= 0;
    }

    private int getDiasMes() {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                return esBisiesto() ? 29 : 28;
            }
            default -> {
                return 0;
            }
        }
    }

    private boolean esBisiesto() {
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
    }
}
