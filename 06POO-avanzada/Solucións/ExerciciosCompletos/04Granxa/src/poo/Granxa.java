package poo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Marta
 */
public class Granxa {
    private String nome;
    private String localizacion;
    private Empregado encargado;
    private ArrayList<Empregado> empregados;
    private int[] numAnimais;

    public Granxa(String nome, String localizacion, Empregado encargado) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.empregados = new ArrayList<>();
        this.numAnimais = new int[5];
        for (int i = 0; i < numAnimais.length; i++) {
            numAnimais[i] = 0;
        }
    }

    public Granxa(String nome, String localizacion, Empregado encargado, ArrayList<Empregado> empregados, int[] numAnimais) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.empregados = empregados;
        this.numAnimais = numAnimais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setEncargado(Empregado encargado) {
        this.encargado = encargado;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public Empregado getEncargado() {
        return encargado;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public int[] getNumAnimais() {
        return numAnimais;
    }
    
    public void engadirAnimal(TipoAnimal t) {
        TipoAnimal[] tipos = TipoAnimal.values();
        int i = Arrays.binarySearch(tipos, t);
        numAnimais[i]++;
    }
    
    public void engadirEmpregado(Empregado e) {
        empregados.add(e);
    }
    
    public int getNumeroEmpregados(boolean coidadores) {
        int contador = 0;
        if (!coidadores) {
            contador = empregados.size();
        } else {
            for (Empregado e : empregados) {
                if (e instanceof CoidadorAnimais) {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        String resultado =  "Nome: " + nome + "\n" +
                "Localización: " + localizacion + "\n" +
                "Encargado/a: " + encargado.getNome() + "\n" +
                "EMPREGADOS:\n";
        
        for (Empregado e: empregados) {
            resultado += e.getNome() + "\n";
        }
        
        resultado += "porcos: " + numAnimais[0] + 
                "  vacas: " + numAnimais[1] + 
                "  galiñas: " + numAnimais[2] +
                "  coellos: " + numAnimais[3] + 
                "  ovellas: " + numAnimais[4] + "\n";
        
        return resultado;
    }
    
    
}
