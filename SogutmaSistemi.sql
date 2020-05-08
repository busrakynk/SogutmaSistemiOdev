--
-- PostgreSQL database dump
--

-- Dumped from database version 11.7
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: SogutmaSistemi; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "SogutmaSistemi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Turkish_Turkey.1254' LC_CTYPE = 'Turkish_Turkey.1254';


ALTER DATABASE "SogutmaSistemi" OWNER TO postgres;

\connect "SogutmaSistemi"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

--
-- Name: KullaniciHesabi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."KullaniciHesabi" (
    "seriNo" integer NOT NULL,
    sifre integer NOT NULL
);


ALTER TABLE public."KullaniciHesabi" OWNER TO postgres;

--
-- Data for Name: KullaniciHesabi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."KullaniciHesabi" VALUES (1234, 123);


--
-- Name: KullaniciHesabi KullaniciHesabi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciHesabi"
    ADD CONSTRAINT "KullaniciHesabi_pkey" PRIMARY KEY (sifre);


--
-- PostgreSQL database dump complete
--

