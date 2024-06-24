import subprocess
import shared


def main():
    shared.configure_python_path()
    subprocess.check_call(
        ["python", "-m", "pytest", "-vv", "-s", "./tests/autotests/test_task11.py"]
    )


if __name__ == "__main__":
    main()
