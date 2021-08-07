--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.13
-- Dumped by pg_dump version 9.3.13
-- Started on 2021-06-27 11:05:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1 (class 3079 OID 11750)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1938 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 24577)
-- Name: contactos; Type: TABLE; Schema: public; Owner: root; Tablespace: 
--

CREATE TABLE contactos (
    identificacion integer NOT NULL,
    nombre character varying(50),
    apellido character varying(50),
    genero character varying(50),
    tipoidentificacion character varying(10),
    telefono character varying(11),
    direccion character varying(50),
    correo character varying(50)
);


ALTER TABLE public.contactos OWNER TO root;

--
-- TOC entry 1930 (class 0 OID 24577)
-- Dependencies: 171
-- Data for Name: contactos; Type: TABLE DATA; Schema: public; Owner: root
--



--
-- TOC entry 1822 (class 2606 OID 24581)
-- Name: primary_key; Type: CONSTRAINT; Schema: public; Owner: root; Tablespace: 
--

ALTER TABLE ONLY contactos
    ADD CONSTRAINT primary_key PRIMARY KEY (identificacion);


--
-- TOC entry 1937 (class 0 OID 0)
-- Dependencies: 7
-- Name: public; Type: ACL; Schema: -; Owner: root
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM root;
GRANT ALL ON SCHEMA public TO root;
GRANT ALL ON SCHEMA public TO PUBLIC;
 

-- Completed on 2021-06-27 11:05:31

--
-- PostgreSQL database dump complete
--

