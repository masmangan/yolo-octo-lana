--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.2
-- Dumped by pg_dump version 9.2.2
-- Started on 2013-10-17 09:32:23

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1942 (class 1262 OID 12002)
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1943 (class 1262 OID 12002)
-- Dependencies: 1942
-- Name: postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 173 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1946 (class 0 OID 0)
-- Dependencies: 173
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 172 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 1947 (class 0 OID 0)
-- Dependencies: 172
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 169 (class 1259 OID 33632)
-- Name: pdr_contas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pdr_contas (
    conta_id integer NOT NULL,
    cpf character varying NOT NULL,
    nome character varying NOT NULL,
    numero character varying NOT NULL
);


ALTER TABLE public.pdr_contas OWNER TO postgres;

--
-- TOC entry 1948 (class 0 OID 0)
-- Dependencies: 169
-- Name: TABLE pdr_contas; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE pdr_contas IS 'Dados de uma conta bancária. Por simplicidade, também armazena dados do cliente.';


--
-- TOC entry 168 (class 1259 OID 33630)
-- Name: pdr_contas_conta_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE pdr_contas_conta_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pdr_contas_conta_id_seq OWNER TO postgres;

--
-- TOC entry 1949 (class 0 OID 0)
-- Dependencies: 168
-- Name: pdr_contas_conta_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE pdr_contas_conta_id_seq OWNED BY pdr_contas.conta_id;


--
-- TOC entry 171 (class 1259 OID 33643)
-- Name: pdr_movimentacoes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pdr_movimentacoes (
    movimentacao_id integer NOT NULL,
    data timestamp with time zone NOT NULL,
    conta integer,
    valor numeric(10,2),
    descricao character varying
);


ALTER TABLE public.pdr_movimentacoes OWNER TO postgres;

--
-- TOC entry 1950 (class 0 OID 0)
-- Dependencies: 171
-- Name: TABLE pdr_movimentacoes; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE pdr_movimentacoes IS 'Uma operação realizada em uma conta bancária. A operação altera o saldo da conta.';


--
-- TOC entry 1951 (class 0 OID 0)
-- Dependencies: 171
-- Name: COLUMN pdr_movimentacoes.data; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN pdr_movimentacoes.data IS 'Data e hora do registro da operação.';


--
-- TOC entry 170 (class 1259 OID 33641)
-- Name: pdr_movimentacoes_movimentacao_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE pdr_movimentacoes_movimentacao_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pdr_movimentacoes_movimentacao_id_seq OWNER TO postgres;

--
-- TOC entry 1952 (class 0 OID 0)
-- Dependencies: 170
-- Name: pdr_movimentacoes_movimentacao_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE pdr_movimentacoes_movimentacao_id_seq OWNED BY pdr_movimentacoes.movimentacao_id;


--
-- TOC entry 1925 (class 2604 OID 33635)
-- Name: conta_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pdr_contas ALTER COLUMN conta_id SET DEFAULT nextval('pdr_contas_conta_id_seq'::regclass);


--
-- TOC entry 1926 (class 2604 OID 33646)
-- Name: movimentacao_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pdr_movimentacoes ALTER COLUMN movimentacao_id SET DEFAULT nextval('pdr_movimentacoes_movimentacao_id_seq'::regclass);


--
-- TOC entry 1935 (class 0 OID 33632)
-- Dependencies: 169
-- Data for Name: pdr_contas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY pdr_contas (conta_id, cpf, nome, numero) FROM stdin;
1	12345678901	Dilma Roussef	ABCXXX001
2	23456789012	Tarso Genro	ABCXYZ002
3	34567890123	José Fortunati	ABCABC003
\.


--
-- TOC entry 1953 (class 0 OID 0)
-- Dependencies: 168
-- Name: pdr_contas_conta_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('pdr_contas_conta_id_seq', 24, true);


--
-- TOC entry 1937 (class 0 OID 33643)
-- Dependencies: 171
-- Data for Name: pdr_movimentacoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY pdr_movimentacoes (movimentacao_id, data, conta, valor, descricao) FROM stdin;
1	2013-08-08 16:20:01-03	1	1300.00	depósito
2	2013-08-15 10:10:10-03	2	120.99	depósito
3	2013-01-01 00:00:00-02	3	1.99	depósito
4	2013-08-08 09:40:20.838-03	1	12900.12	depósito
\.


--
-- TOC entry 1954 (class 0 OID 0)
-- Dependencies: 170
-- Name: pdr_movimentacoes_movimentacao_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('pdr_movimentacoes_movimentacao_id_seq', 4, true);


--
-- TOC entry 1928 (class 2606 OID 42104)
-- Name: pdr_contas_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pdr_contas
    ADD CONSTRAINT pdr_contas_cpf_key UNIQUE (cpf);


--
-- TOC entry 1930 (class 2606 OID 33640)
-- Name: pdr_contas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pdr_contas
    ADD CONSTRAINT pdr_contas_pkey PRIMARY KEY (conta_id);


--
-- TOC entry 1932 (class 2606 OID 33648)
-- Name: pdr_movimentacoes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY pdr_movimentacoes
    ADD CONSTRAINT pdr_movimentacoes_pkey PRIMARY KEY (movimentacao_id);


--
-- TOC entry 1933 (class 2606 OID 33649)
-- Name: pdr_movimentacoes_conta_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY pdr_movimentacoes
    ADD CONSTRAINT pdr_movimentacoes_conta_fkey FOREIGN KEY (conta) REFERENCES pdr_contas(conta_id);


--
-- TOC entry 1945 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2013-10-17 09:32:23

--
-- PostgreSQL database dump complete
--

