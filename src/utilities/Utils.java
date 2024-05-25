/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Lucas
 */
public class Utils {

  //limpar os campos
  public void limparCampos(JPanel container) {
    Component components[] = container.getComponents();
    for (Component component : components) {
      if (component instanceof JTextField jTextField) {
        jTextField.setText(null);
      } else if (component instanceof JComboBox) {
                ((JComboBox<?>) component).setSelectedIndex(-1);
      }
    }
  }
  
  //Verificar se todos os campos estão preenchidos
  public boolean verificarCampos(JPanel container) {
      List<String> camposIgnorados = Arrays.asList(
              "txtcodigo", "txtlocado", "txtano", "txtplaca", "txtvalor", "txtcomplemento" );
      Component[] components = container.getComponents();
      for (Component component : components) {
          if (component instanceof JTextField jTextField) {
            String name = component.getName();
            if (camposIgnorados.contains(name)) {
                continue;
            }
              String text = jTextField.getText();
              if (text == null || text.trim().isEmpty()) {
                  return false;
              }
          }
      }
      return true;
  }


  //Validar data
  public static boolean validarData(String dataString) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    try {
      LocalDate data = LocalDate.parse(dataString, formatter);
      LocalDate dataAtual = LocalDate.now();
      LocalDate umAnoNoFuturo = dataAtual.plusYears(1);

      if (data.isBefore(dataAtual) || data.isAfter(umAnoNoFuturo)) {
        return false;
      }
      return true;
    } catch (DateTimeParseException e) {
      return false;
    }
  }

  //Validar número
  public static boolean validarNumero(String string) {
    if (string == null || string.isEmpty()) {
      return false;
    }

    try {
      int number = Integer.parseInt(string);
      return number > 0 && number < 180;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
