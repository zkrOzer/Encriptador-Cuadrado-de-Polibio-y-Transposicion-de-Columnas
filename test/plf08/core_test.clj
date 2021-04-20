(ns plf08.core-test
  (:require [clojure.test :refer [deftest is testing]]
           [plf08.core :refer [codificar-columnas descifrar codificar decodificar-columnas]]))


(deftest descifrar-polibio-test
  (testing "prueba de decodificacion 1"
    (is (= "PAPA" (descifrar "♔♖♗♖♔♖♗♖")))
    (is (= "JO" (descifrar "♕♗♔♛")))
    (is (= "TS" (descifrar "♔♔♔♕")))
    (is (= "hola" (descifrar "♜♔♞♕♞♚♜♜")))))

(deftest codificar-columnas-test
  (testing "prueba de codificacion 1"
    (is (= "lcoss o mea hao t " (codificar-columnas "plf" "hola como estas")))
    (is (= "nte baase d usr " (codificar-columnas "hola" "buenas tardes")))
    (is (= "nner baosoe hpeusc f" (codificar-columnas "hola" "buenas noches profe")))
    (is (= "USMI JEAANSY TZO IRE" (codificar-columnas "hola" "JOSUE YSAI MARTINEZ")))))

(deftest codificar-polibio-test
  (testing "prueba de codificacion 1"
    (is (= "♜♔♞♕♞♚♜♜" (apply str (flatten (codificar (vector "hola"))))))
    (is (= "♕♗♔♛♔♕••♕♜" (apply str (flatten (codificar (vector "JOSUE"))))))
    (is (= "♔♖♗♖♔♖♗♖" (apply str (flatten (codificar (vector "PAPA"))))))
    (is (= "♔♖♔♗♔♛♕♝♕♜  ♖♛♗♕" (apply str (flatten (codificar (vector "PROFE :C"))))))))

(deftest decodificar-columnas-test
  (testing "prueba de codificacion 1"
    (is (= "hola como estas " (decodificar-columnas "hola" "ams h otloesoc a")))
    (is (= "JOSUE YSAI MARTINEZ " (decodificar-columnas "hola" "USMI JEAANSY TZO IRE")))
    (is (= "hola como estuviste " (decodificar-columnas "hola" "amsi h otsloeveoc ut")))))



