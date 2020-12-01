package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Quiz.QUESTION_1;
import static com.company.Quiz.QUESTION_2;
import static com.company.Quiz.QUESTION_3;
import static com.company.Quiz.QUESTION_4;
import static com.company.Quiz.QUESTION_5;

public class Main {

    private static JRadioButton answer11,answer12,answer13,answer14,answer21,answer22,answer23,answer24,answer31,answer32,answer33,answer34,answer41,answer42,answer43,answer44,answer51,answer52,answer53,answer54;
    private static JButton checkButton1,nextButton1,checkButton2,nextButton2,checkButton3,nextButton3,checkButton4,nextButton4,checkButton5,finishButton;
    private static Integer correct=0;
    public static void main(String[] args) {
        JPanel panel = buildPanel();
        addActionToButon1(panel);
    }

    private static void addActionToButon1(JPanel panel) {
        checkButton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String yourAnswer = null;

                        if(answer11.isSelected())
                            yourAnswer=answer11.getText();
                        else
                        if(answer12.isSelected())
                            yourAnswer=answer12.getText();
                        else
                        if(answer13.isSelected())
                            yourAnswer=answer13.getText();
                        else
                        if(answer14.isSelected())
                            yourAnswer=answer14.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "You forgot to answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if(yourAnswer!=null){
                        if(yourAnswer.equals(QUESTION_1.getCorrectAnsswer())){
                            dataLabel = new JLabel("Correct!", SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                            correct++;
                        }
                        else{
                            dataLabel = new JLabel("Wrong! The correct answer is " + QUESTION_1.getCorrectAnsswer(), SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                        }}
                        panel.updateUI();
                    }
                }
        );
        nextButton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents2(panel);
                        panel.updateUI();
                        addActionToButon2(panel);
                    }
                }
        );}
    private static void addActionToButon2(JPanel panel) {
        checkButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String yourAnswer = null;

                        if(answer21.isSelected())
                            yourAnswer=answer21.getText();
                        else
                        if(answer22.isSelected())
                            yourAnswer=answer22.getText();
                        else
                        if(answer23.isSelected())
                            yourAnswer=answer23.getText();
                        else
                        if(answer24.isSelected())
                            yourAnswer=answer24.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "You forgot to answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if(yourAnswer!=null){
                        if(yourAnswer.equals(QUESTION_2.getCorrectAnsswer())){
                            dataLabel = new JLabel("Correct!", SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                            correct++;
                        }
                        else{
                            dataLabel = new JLabel("Wrong! The correct answer is " + QUESTION_2.getCorrectAnsswer(),SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                        }}
                        panel.updateUI();
                    }
                }
        );
        nextButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents3(panel);
                        panel.updateUI();
                        addActionToButon3(panel);
                    }
                }
        );}
    private static void addActionToButon3(JPanel panel) {
        checkButton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String yourAnswer = null;

                        if (answer31.isSelected())
                            yourAnswer = answer31.getText();
                        else if (answer32.isSelected())
                            yourAnswer = answer32.getText();
                        else if (answer33.isSelected())
                            yourAnswer = answer33.getText();
                        else
                        if(answer34.isSelected())
                            yourAnswer=answer34.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "You forgot to answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if(yourAnswer!=null){
                        if (yourAnswer.equals(QUESTION_3.getCorrectAnsswer())) {
                            dataLabel = new JLabel("Correct!", SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                            correct++;
                        } else {
                            dataLabel = new JLabel("Wrong! The correct answer is " + QUESTION_3.getCorrectAnsswer(), SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                        }}
                        panel.updateUI();
                    }
                }
        );
        nextButton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents4(panel);
                        panel.updateUI();
                        addActionToButon4(panel);
                    }
                }
        );
    }
    private static void addActionToButon4(JPanel panel) {
        checkButton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String yourAnswer = null;

                        if(answer41.isSelected())
                            yourAnswer=answer41.getText();
                        else
                        if(answer42.isSelected())
                            yourAnswer=answer42.getText();
                        else
                        if(answer43.isSelected())
                            yourAnswer=answer43.getText();
                        else
                        if(answer44.isSelected())
                            yourAnswer=answer44.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "You forgot to answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if(yourAnswer!=null){
                        if(yourAnswer.equals(QUESTION_4.getCorrectAnsswer())){
                            dataLabel = new JLabel("Correct!", SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                            correct++;
                        }
                        else{
                            dataLabel = new JLabel("Wrong! The correct answer is " + QUESTION_4.getCorrectAnsswer(), SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                        }}
                        panel.updateUI();
                    }
                }
        );
        nextButton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents5(panel);
                        panel.updateUI();
                        addActionToButon5(panel);
                    }
                }
        );}
    private static void addActionToButon5(JPanel panel) {
        checkButton5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String yourAnswer = null;

                        if(answer51.isSelected())
                            yourAnswer=answer51.getText();
                        else
                        if(answer52.isSelected())
                            yourAnswer=answer52.getText();
                        else
                        if(answer53.isSelected())
                            yourAnswer=answer53.getText();
                        else
                        if(answer54.isSelected())
                            yourAnswer=answer54.getText();
                        else
                            JOptionPane.showMessageDialog(panel, "You forgot to answer!",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        JLabel dataLabel;
                        if(yourAnswer!=null){
                        if(yourAnswer.equals(QUESTION_5.getCorrectAnsswer())){
                            dataLabel = new JLabel("Correct!", SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                            correct++;
                        }
                        else{
                            dataLabel = new JLabel("Wrong! The correct answer is " + QUESTION_5.getCorrectAnsswer(), SwingConstants.CENTER);
                            dataLabel.setBounds(10, 120, 530, 25);
                            panel.add(dataLabel);
                        }}
                        panel.updateUI();
                    }
                }
        );
        finishButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        JLabel L1 = new JLabel(correct+" correct answers and "+(5-correct)+" wrong answers", SwingConstants.CENTER);
                        L1.setBounds(10, 75, 530, 25);
                        panel.add(L1);
                        JLabel L2 = new JLabel(20*correct+"%", SwingConstants.CENTER);
                        L2.setBounds(10, 110, 530, 25);
                        panel.add(L2);
                        panel.updateUI();

                    }
                }
        );
    }

    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Quiz");
        frame.setSize(550, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents1(panel);

        frame.setVisible(true);

        return panel;
    }

    private static void placeComponents1(JPanel panel) {

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WORLD CAPITALS QUIZ ",SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(QUESTION_1.getQuestion(),SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        answer11 = new JRadioButton();
        answer11.setText(QUESTION_1.getAnswer1());
        answer11.setBounds(20, 90, 120, 25);
        panel.add(answer11);

        answer12 = new JRadioButton();
        answer12.setText(QUESTION_1.getAnswer2());
        answer12.setBounds(150, 90, 120, 25);
        panel.add(answer12);

        answer13 = new JRadioButton();
        answer13.setText(QUESTION_1.getAnswer3());
        answer13.setBounds(280, 90, 120, 25);
        panel.add(answer13);

        answer14 = new JRadioButton();
        answer14.setText(QUESTION_1.getAnswer4());
        answer14.setBounds(410, 90, 120, 25);
        panel.add(answer14);

        checkButton1 = new JButton("CHECK THE ANSWER");
        checkButton1.setBounds(30, 150, 200, 25);
        panel.add(checkButton1);

        nextButton1 = new JButton("NEXT QUESTION");
        nextButton1.setBounds(300, 150, 200, 25);
        panel.add(nextButton1);

    }
    private static void placeComponents2(JPanel panel) {

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WORLD CAPITALS QUIZ ",SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(QUESTION_2.getQuestion(),SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        answer21 = new JRadioButton();
        answer21.setText(QUESTION_2.getAnswer1());
        answer21.setBounds(20, 90, 120, 25);
        panel.add(answer21);

        answer22 = new JRadioButton();
        answer22.setText(QUESTION_2.getAnswer2());
        answer22.setBounds(150, 90, 120, 25);
        panel.add(answer22);

        answer23 = new JRadioButton();
        answer23.setText(QUESTION_2.getAnswer3());
        answer23.setBounds(280, 90, 120, 25);
        panel.add(answer23);

        answer24 = new JRadioButton();
        answer24.setText(QUESTION_2.getAnswer4());
        answer24.setBounds(410, 90, 120, 25);
        panel.add(answer24);

        checkButton2 = new JButton("CHECK THE ANSWER");
        checkButton2.setBounds(30, 150, 200, 25);
        panel.add(checkButton2);

        nextButton2 = new JButton("NEXT QUESTION");
        nextButton2.setBounds(300, 150, 200, 25);
        panel.add(nextButton2);

    }
    private static void placeComponents3(JPanel panel) {

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WORLD CAPITALS QUIZ ",SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(QUESTION_3.getQuestion(),SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        answer31 = new JRadioButton();
        answer31.setText(QUESTION_3.getAnswer1());
        answer31.setBounds(20, 90, 120, 25);
        panel.add(answer31);

        answer32 = new JRadioButton();
        answer32.setText(QUESTION_3.getAnswer2());
        answer32.setBounds(150, 90, 120, 25);
        panel.add(answer32);

        answer33 = new JRadioButton();
        answer33.setText(QUESTION_3.getAnswer3());
        answer33.setBounds(280, 90, 120, 25);
        panel.add(answer33);

        answer34 = new JRadioButton();
        answer34.setText(QUESTION_3.getAnswer4());
        answer34.setBounds(410, 90, 120, 25);
        panel.add(answer34);

        checkButton3 = new JButton("CHECK THE ANSWER");
        checkButton3.setBounds(30, 150, 200, 25);
        panel.add(checkButton3);

        nextButton3 = new JButton("NEXT QUESTION");
        nextButton3.setBounds(300, 150, 200, 25);
        panel.add(nextButton3);

    }
    private static void placeComponents4(JPanel panel) {

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WORLD CAPITALS QUIZ ",SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(QUESTION_4.getQuestion(),SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        answer41 = new JRadioButton();
        answer41.setText(QUESTION_4.getAnswer1());
        answer41.setBounds(20, 90, 120, 25);
        panel.add(answer41);

        answer42 = new JRadioButton();
        answer42.setText(QUESTION_4.getAnswer2());
        answer42.setBounds(150, 90, 120, 25);
        panel.add(answer42);

        answer43 = new JRadioButton();
        answer43.setText(QUESTION_4.getAnswer3());
        answer43.setBounds(280, 90, 120, 25);
        panel.add(answer43);

        answer44 = new JRadioButton();
        answer44.setText(QUESTION_4.getAnswer4());
        answer44.setBounds(410, 90, 120, 25);
        panel.add(answer44);

        checkButton4 = new JButton("CHECK THE ANSWER");
        checkButton4.setBounds(30, 150, 200, 25);
        panel.add(checkButton4);

        nextButton4 = new JButton("NEXT QUESTION");
        nextButton4.setBounds(300, 150, 200, 25);
        panel.add(nextButton4);

    }
    private static void placeComponents5(JPanel panel) {

        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WORLD CAPITALS QUIZ ",SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 530, 25);
        panel.add(titleLabel);

        JLabel questionLabel = new JLabel(QUESTION_5.getQuestion(),SwingConstants.CENTER);
        questionLabel.setBounds(10, 60, 530, 25);
        panel.add(questionLabel);

        answer51 = new JRadioButton();
        answer51.setText(QUESTION_5.getAnswer1());
        answer51.setBounds(20, 90, 120, 25);
        panel.add(answer51);

        answer52 = new JRadioButton();
        answer52.setText(QUESTION_5.getAnswer2());
        answer52.setBounds(150, 90, 120, 25);
        panel.add(answer52);

        answer53 = new JRadioButton();
        answer53.setText(QUESTION_5.getAnswer3());
        answer53.setBounds(280, 90, 120, 25);
        panel.add(answer53);

        answer54 = new JRadioButton();
        answer54.setText(QUESTION_5.getAnswer4());
        answer54.setBounds(410, 90, 120, 25);
        panel.add(answer54);

        checkButton5 = new JButton("CHECK THE ANSWER");
        checkButton5.setBounds(30, 150, 200, 25);
        panel.add(checkButton5);

        finishButton = new JButton("FINISH");
        finishButton.setBounds(300, 150, 200, 25);
        panel.add(finishButton);
    }
}
