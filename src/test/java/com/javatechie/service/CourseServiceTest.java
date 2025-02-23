package com.javatechie.service;

import com.javatechie.dao.CourseDao;
import com.javatechie.dto.CourseRequestDTO;
import com.javatechie.dto.CourseResponseDTO;
import com.javatechie.entity.CourseEntity;
import com.javatechie.util.AppUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CourseServiceTest {

//    @Mock
//    private CourseDao courseDao;
//
//    @InjectMocks
//    private CourseService courseService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testOnboardNewCourse() {
//        CourseRequestDTO requestDTO = new CourseRequestDTO();
//        CourseEntity courseEntity = new CourseEntity();
//        CourseEntity savedEntity = new CourseEntity();
//        savedEntity.setCourseId(1);
//        CourseResponseDTO responseDTO = new CourseResponseDTO();
//        responseDTO.setCourseUniqueCode(UUID.randomUUID().toString().split("-")[0]);
//
//        when(courseDao.save(any(CourseEntity.class))).thenReturn(savedEntity);
//        when(AppUtils.mapDTOToEntity(requestDTO)).thenReturn(courseEntity);
//        when(AppUtils.mapEntityToDTO(savedEntity)).thenReturn(responseDTO);
//
//        CourseResponseDTO result = courseService.onboardNewCourse(requestDTO);
//
//        assertEquals(responseDTO.getCourseUniqueCode(), result.getCourseUniqueCode());
//        verify(courseDao, times(1)).save(courseEntity);
//    }
//
//    @Test
//    void testViewAllCourses() {
//        CourseEntity courseEntity1 = new CourseEntity();
//        CourseEntity courseEntity2 = new CourseEntity();
//        List<CourseEntity> courseEntities = Arrays.asList(courseEntity1, courseEntity2);
//        CourseResponseDTO responseDTO1 = new CourseResponseDTO();
//        CourseResponseDTO responseDTO2 = new CourseResponseDTO();
//
//        when(courseDao.findAll()).thenReturn(courseEntities);
//        when(AppUtils.mapEntityToDTO(courseEntity1)).thenReturn(responseDTO1);
//        when(AppUtils.mapEntityToDTO(courseEntity2)).thenReturn(responseDTO2);
//
//        List<CourseResponseDTO> result = courseService.viewAllCourses();
//
//        assertEquals(2, result.size());
//        verify(courseDao, times(1)).findAll();
//    }
//
//    @Test
//    void testFindByCourseId() {
//        int courseId = 1;
//        CourseEntity courseEntity = new CourseEntity();
//        CourseResponseDTO responseDTO = new CourseResponseDTO();
//
//        when(courseDao.findById(courseId)).thenReturn(Optional.of(courseEntity));
//        when(AppUtils.mapEntityToDTO(courseEntity)).thenReturn(responseDTO);
//
//        CourseResponseDTO result = courseService.findByCourseId(courseId);
//
//        assertEquals(responseDTO, result);
//        verify(courseDao, times(1)).findById(courseId);
//    }
//
//    @Test
//    void testDeleteCourse() {
//        int courseId = 1;
//
//        doNothing().when(courseDao).deleteById(courseId);
//
//        courseService.deleteCourse(courseId);
//
//        verify(courseDao, times(1)).deleteById(courseId);
//    }
//
//    @Test
//    void testUpdateCourse() {
//        int courseId = 1;
//        CourseRequestDTO requestDTO = new CourseRequestDTO();
//        CourseEntity existingCourseEntity = new CourseEntity();
//        CourseEntity updatedCourseEntity = new CourseEntity();
//        CourseResponseDTO responseDTO = new CourseResponseDTO();
//
//        when(courseDao.findById(courseId)).thenReturn(Optional.of(existingCourseEntity));
//        when(courseDao.save(existingCourseEntity)).thenReturn(updatedCourseEntity);
//        when(AppUtils.mapEntityToDTO(updatedCourseEntity)).thenReturn(responseDTO);
//
//        CourseResponseDTO result = courseService.updateCourse(courseId, requestDTO);
//
//        assertEquals(responseDTO, result);
//        verify(courseDao, times(1)).findById(courseId);
//        verify(courseDao, times(1)).save(existingCourseEntity);
//    }
}
