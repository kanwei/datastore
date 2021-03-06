;; a simple not-empty? predicate
(def not-empty? (complement empty?))
;; => #'user/not-empty?

(not-empty? [])
;; => false

(not-empty? [1 2])
;; => true

;; a slightly more complex example
;; this function takes two arguments, and sometimes returns nil

(defn contains-char? [the-string, the-char]
  (some #(= the-char %) the-string))
;; => #'user/contains-char?

(contains-char? "abc" \b)
;; => true

(contains-char? "abc" \j)
;; => nil

;; define the complement, to check if a char is absent
(def does-not-contain-char? (complement contains-char?))
;; => #'user/does-not-contain-char?

;; our complement does exactly what we expect
(does-not-contain-char? "abc" \b)
;; => false

(does-not-contain-char? "abc" \j)
;; => true
