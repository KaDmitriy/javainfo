package app.kadmitriy.javainfo.test;

public interface Test {

	/**
	 * Запуск теста
	 */
	public void run();
	
	/**
	 * Время выполнения теста
	 * @return время затраченное на работу
	 */
	public long getTimeElapsed();
	
}
