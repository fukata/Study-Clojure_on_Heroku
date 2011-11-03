(ns heroku_helloworld.core
  (:use compojure.core
        ring.adapter.jetty))

(defroutes app 
  (GET "/" {} "Hello World"))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
