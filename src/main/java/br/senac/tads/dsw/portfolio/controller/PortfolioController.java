package br.senac.tads.dsw.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortfolioController {
    @GetMapping("/")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("name", "Marcos Souza Dos Santos");
        mv.addObject("email", "farmarcos@hotmail.com");
        mv.addObject("telefone", "(11) 96044-3531");
        mv.addObject("nascimento", "13/02/1986");
        mv.addObject("linkedin", "https://www.linkedin.com/in/marcos-souza-540b9b64/");

        mv.addObject("github", "Github:https:https://github.com/Marcosgael/PaginaSimples ");
        mv.addObject("experiencia", "Autônomo");
        mv.addObject("cargo", "Front-end developer");
        mv.addObject("periodo", "Periodo: desde 2022");
        mv.addObject("curso", "Analise  Desenvolivimento de Sistemas");
        mv.addObject("unidade", "Senac - Santo Amaro");
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
