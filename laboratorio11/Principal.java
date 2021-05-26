package laboratorio11;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Principal {
   
    public static void MostraIRFunc(File f) throws IOException, FileNotFoundException {
        try {
            Funcionario funci;
            ArrayList<Funcionario> funcionario = new ArrayList<>();
            double valorIRF = 0, valorIRM = 0, valorIRT;

            FileReader file = new FileReader(f); 
            BufferedReader bfr = new BufferedReader(file); 
            String linha = null;
            String[] dados = null;

            while ((linha = bfr.readLine()) != null) {
                dados = linha.split("#");
                funci = new Funcionario(dados[0], dados[0].charAt(0), Double.parseDouble(dados[0]), Integer.parseInt(dados[4]));

                switch(funci.sexo) {
                    case 'F':
                        valorIRF = valorIRF + funci.impostoRenda();
                        break;
                    case 'M':
                        valorIRM = valorIRM + funci.impostoRenda();
                        break;
                }

                funcionario.add(funci);
            }

            valorIRT = valorIRF + valorIRM;

            for (int i = 0; i < funcionario.size(); i++) {
                System.out.println(funcionario.get(i).mostraFuncionario() + "\n");
            }
            
            JOptionPane.showMessageDialog(null, "IR F: " + valorIRF + "\n -IR M: " + valorIRM + "\n -IR Total: "+valorIRT);
            
            bfr.close();
            file.close();
            
        } catch (Exception y) {
            System.out.println(y);
        }
        
                   
        InputStream ips = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(ips);
        BufferedReader bfr = new BufferedReader(isr);
         
        
    }

    public static void GravaObjFunc(File f) throws IOException, FileNotFoundException {
        try {
            Funcionario funci;
            ArrayList<Funcionario> funcionario = new ArrayList<>();

            FileReader file = new FileReader(f); 
            BufferedReader bfr = new BufferedReader(file); 
            String linha = null;
            String[] dados = null;

            while ((linha = bfr.readLine()) != null) {
                dados = linha.split("*");
                funci = new Funcionario(dados[0], dados[0].charAt(0), Double.parseDouble(dados[0]), Integer.parseInt(dados[4]));

                funcionario.add(funci);
            }

            String newFPath = f.getPath();
            newFPath = newFPath.substring(0, newFPath.lastIndexOf('-')-1) + "-OBJETOS.txt: ";
            
            OutputStream ops = new FileOutputStream(newFPath); 
            ObjectOutputStream oos = new ObjectOutputStream(ops);
            oos.writeObject(funcionario);
            oos.flush();
            oos.close();
            ops.flush();
            ops.close();

            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso em arquivo!!");

            JOptionPane.showMessageDialog(null, "Aguarde, lendo arquivo texto OBJETOS...");
            MostraObjIRFunc(new File(newFPath));
            
        } catch (Exception y) {
            System.out.println(y);
        }

    }

    private static void MostraObjIRFunc(File f) throws IOException, FileNotFoundException {
        try {
            ArrayList<Funcionario> funci;
            double valorIRF = 0, valorIRM = 0, valorIRT;

            InputStream is = new FileInputStream(f); 
            ObjectInputStream objis = new ObjectInputStream(is);
  
            funci = (ArrayList<Funcionario>) objis.readObject();

            for (int i = 0; i < funci.size(); i++) {
                switch(funci.get(i).sexo) {
                    case 'F':
                        valorIRF = valorIRF + funci.get(i).impostoRenda();
                        break;
                    case 'M':
                        valorIRM = valorIRM + funci.get(i).impostoRenda();
                        break;
                }

                System.out.println(funci.get(i).mostraFuncionario() + "\n");
            }

            valorIRT = valorIRF + valorIRM;

            JOptionPane.showMessageDialog(null, "IR F: " + valorIRF + 
            		"IR M: " + valorIRM + 
            		"IR Total: "+valorIRT);
            
            objis.close();
            is.close();

        } catch (Exception y) {
            System.out.println(y);
        }

    }
    
    public static void main(String[] args) throws IOException {
        JFileChooser func = new JFileChooser();

        JOptionPane.showMessageDialog(null, "Selecione o arquivo de texto: ");

        int resultado = func.showSaveDialog(null);

        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(0);
        }
        else {
            File f = func.getSelectedFile();

            int oper = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da ação desejada:  1-Mostrar Funcionários e Imposto de Renda, 2-Gravar objeto em arquivo)"));
            
            switch (oper) {
                case 1:
                    MostraIRFunc(f);
                    break;
                case 2:
                    GravaObjFunc(f);
                    break;
                case 3:
                    MostraObjIRFunc(f);
                    break;
                default:
                    JOptionPane.showInputDialog("Error: OPÇÃO INVÁLIDA");
            }
        }
    }
}
