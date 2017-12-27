package javaGenerics;

	class SampleGenerics<T> {
		T object;
		SampleGenerics(T object)
		{
		this.object = object;
		}
		public T getObject() 
		{
		return object;
		}
		void showType()
		{
		System.out.println("Type of T is : " + object.getClass().getName());
		}
	}
