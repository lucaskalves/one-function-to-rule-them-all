(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat () a-seq))

(defn str-cat [a-seq]
  (if (empty? a-seq)
    ""
    (reduce (fn [a b] (str a " " b)) a-seq)))

(defn my-interpose [x a-seq]
  (if (empty? a-seq)
    ()
    (seq (reduce (fn [a b] (conj a x b)) [(first a-seq)] (rest a-seq)))))

(defn my-count [a-seq]
  (reduce (fn [a _] (inc a)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce #(cons %2 %1) () a-seq))

(defn min-max-element [a-seq]
  (let [helper (fn [[a b] c]
                    [(min a c) (max b c)])]
    (if (empty? a-seq)
      []
     (reduce helper [(first a-seq) (first a-seq)] (rest a-seq)))))

(defn insert [sorted-seq n]
  (let [helper (fn [init end n]
                 (cond
                   (empty? end) (conj init n)
                   (< n (first end)) (concat (conj init n) end)
                   :else (recur (conj init (first end)) (rest end) n)))]
    (helper [] sorted-seq n)))

(defn insertion-sort [a-seq]
  (reduce insert [] a-seq))

(defn parity [a-seq]
  [:-])

(defn minus [x]
  :-)

(defn count-params [x]
  :-)

(defn my-* [x]
  :-)

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])