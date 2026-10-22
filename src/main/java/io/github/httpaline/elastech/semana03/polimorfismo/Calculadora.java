package io.github.httpaline.elastech.semana03.polimorfismo;

public class Calculadora {
    double calcularArea(double lado) {
        return lado * lado;
    }

    double calcularArea(double base, double altura) {
        return base * altura;
    }

    double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}
