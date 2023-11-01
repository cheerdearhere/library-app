package com.group.libraryapp.calculator


import  org.assertj.core.api.*;
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.*
import kotlin.jvm.Throws

//fun main(){
//    val calculatorTest = CalculatorTest()
//    calculatorTest.덧셈테스트();
//}
class CalculatorTest {
    @Test
    fun 덧셈테스트() {
        //given
        val addNum = 5;
        val calculator = Calculator(10);
        //when
        calculator.add(addNum);
        //then
        Assertions.assertThat(calculator.getResult()).isEqualTo(10+5);

    }

    @Test
    fun 뺄셈테스트() {
        //given
        val num = 5;
        val calculator = Calculator(10);
        //when
        calculator.minus(num);
        //then
        Assertions.assertThat(calculator.getResult()).isEqualTo(10-5);
    }

    @Test
    fun 곰셈테스트() {
        //given
        val num = 5;
        val calculator = Calculator(10);
        //when
        calculator.multiply(num);
        //then
        Assertions.assertThat(calculator.getResult()).isEqualTo(10*5);
    }

    @Test
    fun 나눗셈테스트() {
        //given
        val num = 5;
        val calculator = Calculator(10);
        //when
        calculator.divide(num);
        //then
        Assertions.assertThat(calculator.getResult()).isEqualTo(10/5);
    }

    @Test
    @Throws(Exception :: class)
    fun 나눗셈에러(){
        //given

        val calculator = Calculator(10);
        //when
        val num = 0;
        //then
        try{
            calculator.divide(num);
        }
        catch (ie: IllegalArgumentException){
            return
        }
        fail { throw IllegalArgumentException("0으로 나눴을때 에러가 발생해야 함")}
    }
}