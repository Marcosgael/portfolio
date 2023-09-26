package br.senac.tads.dsw.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortfolioController {
    @GetMapping("/")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("name", "Gustavo Pantaleãodesk");
        mv.addObject("email", "Email: gustavo@gmail.com");
        mv.addObject("telefone", "Telefone: gustavo@gmail.com");
        mv.addObject("nascimento", "Data de nascimento: gustavo@gmail.com");
        mv.addObject("linkedin", "LinkedIn");
        mv.addObject("github", "Github: gustavo@gmail.com");
        mv.addObject("experiencia", "OSF Digital");
        mv.addObject("cargo", "Front-end developer");
        mv.addObject("periodo", "Periodo: desde 2022");
        mv.addObject("curso", "Analise");
        mv.addObject("unidade", "Senac");
        mv.addObject("sobre",
                "Sou um desenvolvedor apaixonado pela arte da programação e pela criação de soluções tecnológicas\r\n" + //
                        "            inovadoras. Com um forte compromisso com a excelência técnica e uma sede contínua de aprendizado, estou\r\n"
                        + //
                        "            empenhado em contribuir para projetos desafiadores que impulsionem o progresso e a inovação no mundo da\r\n"
                        + //
                        "            tecnologia.\r\n" + //
                        "\r\n" + //
                        "            Minha jornada como desenvolvedor tem sido marcada pela busca constante de conhecimento, pela resolução\r\n"
                        + //
                        "            criativa de problemas e pelo desejo de criar produtos que tenham um impacto positivo na vida das\r\n"
                        + //
                        "            pessoas. Acredito profundamente no poder da tecnologia para transformar e melhorar o mundo ao nosso\r\n"
                        + //
                        "            redor.\r\n" + //
                        "\r\n" + //
                        "            Tenho trabalhado em uma variedade de projetos ao longo da minha carreira, cada um deles proporcionando\r\n"
                        + //
                        "            experiências únicas que me ajudaram a crescer como profissional. Estou animado para continuar minha\r\n"
                        + //
                        "            jornada de desenvolvimento, colaborando com equipes talentosas e explorando novos horizontes no universo\r\n"
                        + //
                        "            da programação.");

        return mv;
    }
}
