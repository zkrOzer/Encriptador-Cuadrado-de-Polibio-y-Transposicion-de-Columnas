(ns plf08.core
  (:gen-class)
  (:require [clojure.string :as str]))


(defn cuadrado
  []
  (hash-map
   \a "♜♜"
   \á "♜♞"
   \b "♜♝"
   \c "♜♛"
   \d "♜♚"
   \e "♜♖"
   \é "♜♘"
   \f "♜♗"
   \g "♜♕"
   \h "♜♔"
   \i "♞♜"
   \í "♞♞"
   \j "♞♝"
   \k "♞♛"
   \l "♞♚"
   \m "♞♖"
   \n "♞♘"
   \ñ "♞♗"
   \o "♞♕"
   \ó "♞♔"
   \p "♝♜"
   \q "♝♞"
   \r "♝♝"
   \s "♝♛"
   \t "♝♚"
   \u "♝♖"
   \ú "♝♘"
   \ü "♝♗"
   \v "♝♕"
   \w "♝♔"
   \x "♛♜"
   \y "♛♞"
   \z "♛♝"
   \0 "♛♛"
   \1 "♛♚"
   \2 "♛♖"
   \3 "♛♘"
   \4 "♛♗"
   \! "♛♕"
   \" "♛♔"
   \# "♚♜"
   \$ "♚♞"
   \% "♚♝"
   \& "♚♛"
   \' "♚♚"
   \( "♚♖"
   \) "♚♘"
   \* "♚♗"
   \+ "♚♕"
   \, "♚♔"
   \- "♖♜"
   \. "♖♞"
   \/ "♖♝"
   \: "♖♛"
   \; "♖♚"
   \< "♖♖"
   \= "♖♘"
   \> "♖♗"
   \? "♖♕"
   \@ "♖♔"
   \[ "♘♜"
   \\ "♘♞"
   \] "♘♝"
   \^ "♘♛"
   \_ "♘♚"
   \` "♘♖"
   \{ "♘♘"
   \| "♘♗"
   \} "♘♕"
   \~ "♘♔"
   \5 "♗♜"
   \6 "♗♞"
   \7 "♗♝"
   \8 "♗♛"
   \9 "♗♚"
   \space  "  "
   \A	"♗♖"
   \Á	"♗♘"
   \B	"♗♗"
   \C	"♗♕"
   \D	"♗♔"
   \E	"♕♜"
   \É	"♕♞"
   \F	"♕♝"
   \G	"♕♛"
   \H	"♕♚"
   \I	"♕♖"
   \Í	"♕♘"
   \J	"♕♗"
   \K	"♕♕"
   \L	"♕♔"
   \M	"♔♜"
   \N	"♔♞"
   \Ñ	"♔♝"
   \O	"♔♛"
   \Ó	"♔♚"
   \P	"♔♖"
   \Q	"♔♘"
   \R	"♔♗"
   \S	"♔♕"
   \T	"♔♔"
   \U "••"
   \Q "☼☼"
   ))

(defn cuadrado2
  []
  (hash-map
   "♜♜" \a
   "♜♞" \á
   "♜♝" \b
   "♜♛" \c
   "♜♚" \d
   "♜♖" \e
   "♜♘" \é
   "♜♗" \f
   "♜♕" \g
   "♜♔" \h
   "♞♜" \i
   "♞♞" \í
   "♞♝" \j
   "♞♛" \k
   "♞♚" \l
   "♞♖" \m
   "♞♘" \n
   "♞♗" \ñ
   "♞♕" \o
   "♞♔" \ó
   "♝♜" \p
   "♝♞" \q
   "♝♝" \r
   "♝♛" \s
   "♝♚" \t
   "♝♖" \u
   "♝♘" \ú
   "♝♗" \ü
   "♝♕" \v
   "♝♔" \w
   "♛♜" \x
   "♛♞" \y
   "♛♝" \z
   "♛♛" \0
   "♛♚" \1
   "♛♖" \2
   "♛♘" \3
   "♛♗" \4
   "♛♕" \!
   "♛♔" \"
   "♚♜" \#
   "♚♞" \$
   "♚♝" \%
   "♚♛" \&
   "♚♚" \'
   "♚♖" \(
   "♚♘" \)
   "♚♗" \*
   "♚♕" \+
   "♚♔" \,
   "♖♜" \-
   "♖♞" \.
   "♖♝" \/
   "♖♛" \:
   "♖♚" \;
   "♖♖" \<
   "♖♘" \=
   "♖♗" \>
   "♖♕" \?
   "♖♔" \@
   "♘♜" \[
   "♘♞" \\
   "♘♝" \]
   "♘♛" \^
   "♘♚" \_
   "♘♖" \`
   "♘♘" \{
   "♘♗" \|
   "♘♕" \}
   "♘♔" \~
   "♗♜" \5
   "♗♞" \6
   "♗♝" \7
   "♗♛" \8
   "♗♚" \9
   "  " " "
   "♗♖"	\A
   "♗♘"	\Á
   "♗♗"	\B
   "♗♕"	\C
   "♗♔"	\D
   "♕♜"	\E
   "♕♞"	\É
   "♕♝"	\F
   "♕♛"	\G
   "♕♚"	\H
   "♕♖"	\I
   "♕♘"	\Í
   "♕♗"	\J
   "♕♕"	\K
   "♕♔"	\L
   "♔♜"	\M
   "♔♞"	\N
   "♔♝"	\Ñ
   "♔♛"	\O
   "♔♚"	\Ó
   "♔♖"	\P
   "♔♘"	\Q
   "♔♗"	\R
   "♔♕"	\S
   "♔♔"	\T
   "••"   \U
   "☼☼" \Q
   ))

(defn clave
  []
  (hash-map
   \a	0
   \á	1
   \b	2
   \c	3
   \d	4
   \e	5
   \é	6
   \f	7
   \g	8
   \h	9
   \i	10
   \í	11
   \j	12
   \k	13
   \l	14
   \m	15
   \n	16
   \ñ	17
   \o	18
   \ó	19
   \p	20
   \q	21
   \r	22
   \s	23
   \t	24
   \u	25
   \ú	26
   \ü	27
   \v	28
   \w	29
   \x	30
   \y	31
   \z	32
   \0	33
   \1	34
   \2	35
   \3	36
   \4	37
   \!	38
   \"	39
   \#	40
   \$	41
   \%	42
   \&	43
   \'	44
   \(	45
   \)	46
   \*	47
   \+	48
   \,	49
   \-	50
   \.	51
   \/	52
   \:	53
   \;	54
   \<	55
   \=	56
   \>	57
   \?	58
   \@	59
   \[	60
   \\	61
   \]	62
   \^	63
   \_	64
   \`	65
   \{	66
   \|	67
   \}	68
   \~	69
   \5	70
   \6	71
   \7	72
   \8	73
   \9	74
   \A	75
   \Á	76
   \B	77
   \C	78
   \D	79
   \E	80
   \É	81
   \F	82
   \G	83
   \H	84
   \I	85
   \Í	86
   \J	87
   \K	88
   \L	89
   \M	90
   \N	91
   \Ñ	92
   \O	93
   \Ó	94
   \P	95
   \Q	96
   \R	97
   \S	98
   \T	99
   \U	100
   \Ú	101
   \Ü	102
   \V	103
   \W	104
   \X	105
   \Y	106
   \Z	107))

(defn codificar
  [xs]
  (let [tabla (cuadrado)
        comparar (fn [c] (let [v (tabla c)] (if (string? v) v c)))]
    (map (fn [s] (map comparar s)) xs)))

(apply str (flatten (codificar (vector "PROFE :C"))))

(defn descifrar
  [s]
  (let [f (vec (take-nth 2 (map str s (drop 1 s))))]
    (apply str (replace (cuadrado2) f))))

(defn codificar-columnas
  [c s]
  (let [j (apply str (flatten (vals (sort (zipmap ((fn [s] (into [] (replace (clave) s)))
                                                   (str/lower-case c))
                                                  (apply mapv vector (partition-all (count (str/lower-case c))
                                                                                    (str/split (apply str s (repeat (- (count (str/lower-case c))                                                                                                      (mod (count s) (count (str/lower-case c)))) " ")) #""))))))))]
    j))

(codificar-columnas "PLF" "hola como estuviste")

(defn decodificar-columnas
  [l x]
  (let [c (zipmap (vec (sort ((fn [s] (into [] (replace (clave) s))) (str/lower-case l)))) (apply mapv vector (apply mapv vector (partition (/ (count x) (count (str/lower-case l))) (str/split x #"")))))
        f (apply str (flatten (apply mapv vector (replace c ((fn [s] (into [] (replace (clave) s))) (str/lower-case l))))))]
    f))

(decodificar-columnas "hola" "gimproaranco")

(defn -main
  [tipo operacion clavee archivoa archivob]
  (if (or (empty? tipo) (empty? clavee)(empty? operacion)(empty? archivoa) (empty? archivob))
    (println "Campo Vacio")
    (if (= tipo "polibio")
      (if (= operacion "cifrado")
       (spit archivoa(apply str (flatten (codificar (vector (slurp archivob))))))
        (spit archivoa (descifrar (slurp archivob))))
      (if (= tipo "columnas")
        (if (= operacion "cifrado")
          (spit archivoa(codificar-columnas clavee (slurp archivob)))
          (spit archivoa(decodificar-columnas clavee (slurp archivob))))
        (println "Tipo incorrecto")))))