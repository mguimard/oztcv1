package ozt.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class Dates {
	
	public static void main(String[] args) {
		LocalTime time = LocalTime.parse("14:00:00.100");
		System.out.println(time);
	}
	
	public static void main6(String[] args) {
		// ZonedDateTime => LocalDateTime + info du décalage
		ZonedDateTime d = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));		
		System.out.println(d);
		
		LocalDate.of(2025, 3, 30);
		
		var t = LocalDateTime.of(2025, Month.MARCH, 30, 1, 59);		
		System.out.println(t.plusMinutes(1)); // ?
		
		var tEnFrance = ZonedDateTime.of(t, ZoneId.of("Europe/Paris"));
		System.out.println(tEnFrance.plusMinutes(1));
		
		
	}
	
	public static void main5(String[] args) {
		System.out.println(LocalDate.ofEpochDay(0)); // 1970-01-01
		System.out.println(LocalDate.ofEpochDay(1)); // 1970-01-02
		System.out.println(LocalDate.ofEpochDay(-1)); // 1969-12-
		System.out.println(LocalDate.ofEpochDay(-1000000000)); // 1969-12-31
		
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
	}
	
	public static void main4(String[] args) {
		LocalDate now = LocalDate.now();	
		LocalDate dans2jours = now.plus(Period.ofDays(2));
		System.out.println(dans2jours);
		// now.plus(Duration.of(2, ChronoUnit.DAYS)); // boom
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		f = DateTimeFormatter.ISO_DATE;
		System.out.println(f.format(dans2jours));		
	}
	
	public static void main3(String[] args) {
		
		Period p = Period.of(1, 1, 0);
		System.out.println(p);
		
		Duration d = Duration.ofHours(12);
		System.out.println(d);
		
		d.plusHours(1);
		
		System.out.println(d); // 12
		System.out.println(d.plusMinutes(1)); //
		
		Duration tempsImpartit = Duration.ofMinutes(120);
		System.out.println(tempsImpartit);		
	}
	
	public static void main2(String[] args) {
	
		// java.util.Date -> commence à compter à partir de zero
		// LocalDate
		
		/*
		 * Temporal
		 * Jour/Mois/Années
		 * LocalDate
		 * 
		 * Secondes/Minutes/Heures
		 * LocalTime
		 * 
		 * ---> LocalDateTime
		 * 
		 * */
		
		Temporal t1 = LocalDate.now();
		Temporal t2 = LocalTime.now();
		Temporal t3 = LocalDateTime.now();
		
		LocalDate now = LocalDate.now();		
		
		
		System.out.println(now); // 2025-09-11
		
		Duration d = Duration.between(t2, t3); // t3 convertit en t2
		System.out.println(d);
		
		/*
		 * TemporalAmount
		 *  Jour/Mois/Années -> Period
		 *  Secondes/Minutes/Heures -> Duration
		 *  
		 *  
		 *  
		 *  
		 *  A part ----> Instant: point dans le temps (jour/mois/année + heure/min/secondes
		 * */
		
		System.out.println(LocalTime.now());
		System.out.println(Instant.now());
		
	}
}
