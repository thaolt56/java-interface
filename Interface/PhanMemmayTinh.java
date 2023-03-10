
public class PhanMemmayTinh implements MayTinhBoTui, SapXepInterface{

	@Override
	public void SapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}

	@Override
	public void SapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}

	@Override
	public double cong(double a, double b) {
		
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void chia(double a, double b) {
		// TODO Auto-generated method stub
		try {
			System.out.println("phep chia: "+ a/b);
		} catch (Exception e) {
			System.out.println("so chia phai khac 0");
		}
	}

}
