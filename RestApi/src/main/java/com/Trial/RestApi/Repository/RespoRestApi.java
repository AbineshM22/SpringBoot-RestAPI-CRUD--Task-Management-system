package com.Trial.RestApi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trial.RestApi.Entity.Taskstatus;

public interface RespoRestApi extends JpaRepository<Taskstatus,Long> {

//    List<Taskstatus> findAllByStatus(Boolean Status);

}
