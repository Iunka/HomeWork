package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonListener implements ActionListener {
    private final JTextField textField;

    public DigitButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override               //ActionEvent - это экз. класса, кот. хранит инфо о событии
    public void actionPerformed(ActionEvent e) {        //этот метод только для цифровых кнопок
        JButton button = (JButton) e.getSource();       // getSource работает с компонентами, мы сюда вписываем "кнопки"

        StringBuilder sb = new StringBuilder(textField.getText()); // тут мы берём текущее значение, кот. уже присутствует в кнопке
        sb.append(button.getText()); // добавляем значение, кот. пришло к нам с 16й строчки

        textField.setText(sb.toString()); //переустанавливаем значение, чтобы обновить поле
    }
}
