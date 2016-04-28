(ns pier-sdk-clojure.api.conta
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn buscar-conta-using-get-with-http-info
  "/contas/buscar
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([] (buscar-conta-using-get-with-http-info nil))
  ([{:keys [nome cpf numero-cartao id-conta ]}]
   (call-api "/api/v1/contas/buscar" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"nome" nome "cpf" cpf "numeroCartao" numero-cartao "idConta" id-conta }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn buscar-conta-using-get
  "/contas/buscar
  Consulte contas filtrando pelos campos id do emissor, nÃºmero do cartÃ£o, nome ou CPF/CNPJ"
  ([] (buscar-conta-using-get nil))
  ([optional-params]
   (:data (buscar-conta-using-get-with-http-info optional-params))))

(defn consultar-conta-using-get-with-http-info
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-conta ]
  (call-api "/api/v1/contas/{idConta}" :get
            {:path-params   {"idConta" id-conta }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-conta-using-get
  "/contas/{idConta}
  Consulte informaÃ§Ãµes de uma determinada conta"
  [id-conta ]
  (:data (consultar-conta-using-get-with-http-info id-conta)))
