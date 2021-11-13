package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
