/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Component;
import java.awt.Container;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;

/**
 *
 * @author Lucas
 */
public class Utils {

  //limpar os campos
  public void limparCampos(JPanel container) {
    Component components[] = container.getComponents();
    for (Component component : components) {
      if (component instanceof JTextField) {
        ((JTextField) component).setText(null);
      }
    }
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
