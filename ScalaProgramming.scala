{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyNbGpqGQpcAlWNWEF8MRdgo",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/abhishekkm8088/Pyspark-Abhi/blob/main/ScalaProgramming.scala\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "9aL_Y4ozpjsT",
        "outputId": "24ddda42-c3d7-4dae-d74b-cfb8f4b775b0"
      },
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "PRETTY_NAME=\"Ubuntu 22.04.4 LTS\"\n",
            "NAME=\"Ubuntu\"\n",
            "VERSION_ID=\"22.04\"\n",
            "VERSION=\"22.04.4 LTS (Jammy Jellyfish)\"\n",
            "VERSION_CODENAME=jammy\n",
            "ID=ubuntu\n",
            "ID_LIKE=debian\n",
            "HOME_URL=\"https://www.ubuntu.com/\"\n",
            "SUPPORT_URL=\"https://help.ubuntu.com/\"\n",
            "BUG_REPORT_URL=\"https://bugs.launchpad.net/ubuntu/\"\n",
            "PRIVACY_POLICY_URL=\"https://www.ubuntu.com/legal/terms-and-policies/privacy-policy\"\n",
            "UBUNTU_CODENAME=jammy\n"
          ]
        }
      ],
      "source": [
        "!cat /etc/os-release"
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!apt update"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "OJqUGDILtuoZ",
        "outputId": "1513f4de-dee5-4205-f7a7-07a8116f404a"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "\u001b[33m\r0% [Working]\u001b[0m\r            \rGet:1 http://security.ubuntu.com/ubuntu jammy-security InRelease [129 kB]\n",
            "\u001b[33m\r0% [Connecting to archive.ubuntu.com (185.125.190.81)] [1 InRelease 14.2 kB/129\u001b[0m\u001b[33m\r0% [Waiting for headers] [Waiting for headers] [Waiting for headers] [Connected\u001b[0m\r                                                                               \rGet:2 https://cloud.r-project.org/bin/linux/ubuntu jammy-cran40/ InRelease [3,632 B]\n",
            "Hit:3 https://developer.download.nvidia.com/compute/cuda/repos/ubuntu2204/x86_64  InRelease\n",
            "Hit:4 http://archive.ubuntu.com/ubuntu jammy InRelease\n",
            "Get:5 https://r2u.stat.illinois.edu/ubuntu jammy InRelease [6,555 B]\n",
            "Get:6 http://archive.ubuntu.com/ubuntu jammy-updates InRelease [128 kB]\n",
            "Get:7 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 Packages [5,094 kB]\n",
            "Hit:8 https://ppa.launchpadcontent.net/deadsnakes/ppa/ubuntu jammy InRelease\n",
            "Get:9 http://security.ubuntu.com/ubuntu jammy-security/main amd64 Packages [3,204 kB]\n",
            "Get:10 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 Packages [1,270 kB]\n",
            "Hit:11 https://ppa.launchpadcontent.net/graphics-drivers/ppa/ubuntu jammy InRelease\n",
            "Hit:12 https://ppa.launchpadcontent.net/ubuntugis/ppa/ubuntu jammy InRelease\n",
            "Get:13 http://archive.ubuntu.com/ubuntu jammy-backports InRelease [127 kB]\n",
            "Get:14 https://r2u.stat.illinois.edu/ubuntu jammy/main all Packages [9,154 kB]\n",
            "Get:15 https://r2u.stat.illinois.edu/ubuntu jammy/main amd64 Packages [2,772 kB]\n",
            "Get:16 http://archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages [5,290 kB]\n",
            "Get:17 http://archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [3,519 kB]\n",
            "Get:18 http://archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages [1,575 kB]\n",
            "Fetched 32.3 MB in 4s (7,929 kB/s)\n",
            "Reading package lists... Done\n",
            "Building dependency tree... Done\n",
            "Reading state information... Done\n",
            "36 packages can be upgraded. Run 'apt list --upgradable' to see them.\n",
            "\u001b[1;33mW: \u001b[0mSkipping acquire of configured file 'main/source/Sources' as repository 'https://r2u.stat.illinois.edu/ubuntu jammy InRelease' does not seem to provide it (sources.list entry misspelt?)\u001b[0m\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!apt-get install openjdk-11-jdk-headless -qq > /dev/null"
      ],
      "metadata": {
        "id": "ZR9fVUI6tyIJ"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!java -version"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "CYBvLXfBumMm",
        "outputId": "5fd49cad-34d1-4bc5-d50e-c4038e11b449"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "openjdk version \"11.0.28\" 2025-07-15\n",
            "OpenJDK Runtime Environment (build 11.0.28+6-post-Ubuntu-1ubuntu122.04.1)\n",
            "OpenJDK 64-Bit Server VM (build 11.0.28+6-post-Ubuntu-1ubuntu122.04.1, mixed mode, sharing)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!javac -version"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "cs87TL-uuqBi",
        "outputId": "136fe92c-da65-4918-8670-e6bbe31fd903"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "javac 11.0.28\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!wget -q https://archive.apache.org/dist/spark/spark-3.4.1/spark-3.4.1-bin-hadoop3.tgz"
      ],
      "metadata": {
        "id": "a6EZF6m5uuC_"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!tar xf spark-3.4.1-bin-hadoop3.tgz"
      ],
      "metadata": {
        "id": "8WwsicTRu0XE"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!wget -q https://github.com/scala/scala/releases/download/v2.12.18/scala-2.12.18.deb"
      ],
      "metadata": {
        "id": "wjuuhw9dwSbw"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!dpkg -i scala-2.12.18.deb"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "SVY3w0J2wYtg",
        "outputId": "bee63da3-fc2a-4059-9006-900cf03a2089"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Selecting previously unselected package scala.\n",
            "(Reading database ... 126284 files and directories currently installed.)\n",
            "Preparing to unpack scala-2.12.18.deb ...\n",
            "Unpacking scala (2.12.18-400) ...\n",
            "Setting up scala (2.12.18-400) ...\n",
            "Creating system group: scala\n",
            "Creating system user: scala in scala with scala daemon-user and shell /bin/false\n",
            "Processing triggers for man-db (2.10.2-1) ...\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!ls /usr/lib/jvm/java-1.11.0-openjdk-amd64/\n",
        "!ls /content/spark-3.4.1-bin-hadoop3/\n",
        "!ls /content/scala-2.12.18.deb"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "aCh3NX4Uwgw0",
        "outputId": "29cb8329-8a45-4db5-940a-b9c171ec710a"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "bin  conf  docs  include  jmods  legal\tlib  man  release\n",
            "bin   data\tjars\t    LICENSE   NOTICE  R\t\t RELEASE  yarn\n",
            "conf  examples\tkubernetes  licenses  python  README.md  sbin\n",
            "/content/scala-2.12.18.deb\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "# Set environment variables\n",
        "import os\n",
        "os.environ[\"JAVA_HOME\"] = \"/usr/lib/jvm/java-11-openjdk-amd64\"\n",
        "os.environ[\"SPARK_HOME\"] = \"/content/spark-3.4.1-bin-hadoop3\"\n",
        "\n",
        "\n"
      ],
      "metadata": {
        "id": "yAK4HwKexNw4"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!echo $JAVA_HOME"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "-v-nd3820hlg",
        "outputId": "463296d3-1db3-437f-9612-7a83992d041c"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "/usr/lib/jvm/java-11-openjdk-amd64\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!echo $spark-3.4.1-bin-hadoop3"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "UEcPrUbK0pWX",
        "outputId": "09a5b8f8-6cdb-4fe4-f84b-1c168e964a7a"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "-3.4.1-bin-hadoop3\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!pip install -q findspark"
      ],
      "metadata": {
        "id": "fIgI_RRq0wKS"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "import findspark\n",
        "findspark.init()\n",
        "\n",
        "from pyspark.sql import SparkSession\n",
        "spark = SparkSession.builder \\\n",
        "    .appName(\"Colab Scala Spark\") \\\n",
        "    .getOrCreate()\n",
        "spark"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/",
          "height": 219
        },
        "id": "y7p7LtGN1AZ-",
        "outputId": "df43deb1-e42c-4bae-9f0f-8e080d1853d2"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "<pyspark.sql.session.SparkSession at 0x7b28757b7110>"
            ],
            "text/html": [
              "\n",
              "            <div>\n",
              "                <p><b>SparkSession - in-memory</b></p>\n",
              "                \n",
              "        <div>\n",
              "            <p><b>SparkContext</b></p>\n",
              "\n",
              "            <p><a href=\"http://5a8c03372bb7:4040\">Spark UI</a></p>\n",
              "\n",
              "            <dl>\n",
              "              <dt>Version</dt>\n",
              "                <dd><code>v3.4.1</code></dd>\n",
              "              <dt>Master</dt>\n",
              "                <dd><code>local[*]</code></dd>\n",
              "              <dt>AppName</dt>\n",
              "                <dd><code>Colab Scala Spark</code></dd>\n",
              "            </dl>\n",
              "        </div>\n",
              "        \n",
              "            </div>\n",
              "        "
            ]
          },
          "metadata": {},
          "execution_count": 18
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "HelloWorld programme"
      ],
      "metadata": {
        "id": "SW18iWRE66Xz"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "%%writefile HelloWorld.scala\n",
        "object HelloWorld {\n",
        "  def main(args: Array[String]): Unit = {\n",
        "    println(\"Hello, Scala from file!\")\n",
        "  }\n",
        "}"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "Cfj_izQf2K6Z",
        "outputId": "33371385-49e3-43be-ef7d-02db0332845f"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Writing HelloWorld.scala\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!ls\n"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "MkUVTaKf30U8",
        "outputId": "b014175d-1119-476b-cfb0-dd413f21d4f5"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "HelloWorld.scala  scala-2.12.18.deb\t   spark-3.4.1-bin-hadoop3.tgz\n",
            "sample_data\t  spark-3.4.1-bin-hadoop3\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!scalac HelloWorld.scala"
      ],
      "metadata": {
        "id": "U9Kf4eZ4330Q"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!ls\n"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "hGOdNiCg4DEN",
        "outputId": "e9bd231f-0721-4e9e-a002-47bd1d6559ca"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "'HelloWorld$.class'   sample_data\t        spark-3.4.1-bin-hadoop3.tgz\n",
            " HelloWorld.class     scala-2.12.18.deb\n",
            " HelloWorld.scala     spark-3.4.1-bin-hadoop3\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!scala HelloWorld"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "EbN8hQZx4HVS",
        "outputId": "d0ef36e6-0779-427b-db7c-835847287589"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Hello, Scala from file!\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "###CompleteScalaDemo programme"
      ],
      "metadata": {
        "id": "urPE6PvI6_WA"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "%%writefile CompleteScalaDemo.scala\n",
        "object CompleteScalaDemo {\n",
        "  def main(args: Array[String]): Unit = {\n",
        "  //step1: Basic Syntax and variables\n",
        "  val language: String = \"Scala\"\n",
        "  var version: Double = 2.12\n",
        "  println(s\"Step 1: Welcome to $language version $version \")\n",
        "  }\n",
        "}"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "g7hkembx4VTq",
        "outputId": "c17a8e16-0d6b-40b7-85ce-281104760a4e"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Overwriting CompleteScalaDemo.scala\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!scalac CompleteScalaDemo.scala"
      ],
      "metadata": {
        "id": "fRzvXW5T6PTu"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!scala CompleteScalaDemo"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "QxSPkc8o6ZyA",
        "outputId": "8889646c-f327-41a1-9749-2f004cca64a9"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Step 1: Welcome to Scala version 2.12 \n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [],
      "metadata": {
        "id": "tY2pqchTLuzv"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "markdown",
      "source": [
        "#scala LoopDemo"
      ],
      "metadata": {
        "id": "I42GMYRJLqRY"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "%%writefile LoopDemo.scala\n",
        "object LoopDemo {\n",
        "  def main(args: Array[String]): Unit = {\n",
        "    println(\"Demo: While Loop\")\n",
        "    var i = 1\n",
        "    while (i <= 5) {\n",
        "      println(s\"While Loop iteration: $i\")\n",
        "      i += 1\n",
        "    }\n",
        "\n",
        "    println(\"\\nDemo: Do-While Loop\")\n",
        "    var j = 1\n",
        "    do {\n",
        "      println(s\"Do-While Loop iteration: $j\")\n",
        "      j += 1\n",
        "    } while (j <= 5)\n",
        "\n",
        "    println(\"\\nDemo: For Loop with Range\")\n",
        "    for (k <- 1 to 5) {\n",
        "      println(s\"For Loop iteration: $k\")\n",
        "    }\n",
        "\n",
        "    println(\"\\nDemo: For Loop with Guards (only even numbers)\")\n",
        "    for (k <- 1 to 10 if k % 2 == 0) {\n",
        "      println(s\"Even number: $k\")\n",
        "    }\n",
        "\n",
        "    println(\"\\nDemo: For Loop with yield (creates a collection)\")\n",
        "    val squares = for (k <- 1 to 5) yield k * k\n",
        "    println(s\"Squares from 1 to 5: ${squares.mkString(\", \")}\")\n",
        "  }\n",
        "}"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "IEvISk566zWD",
        "outputId": "9dcf0de8-7119-4805-ed3e-749cbfa1766a"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Overwriting LoopDemo.scala\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!scalac LoopDemo.scala\n"
      ],
      "metadata": {
        "id": "Gju8JR13LZjF"
      },
      "execution_count": null,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!scala LoopDemo"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "1gHDpoEYLfMo",
        "outputId": "7bed29a3-6ad4-45dc-8cd8-50f10a31e36d"
      },
      "execution_count": null,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Demo: While Loop\n",
            "While Loop iteration: 1\n",
            "While Loop iteration: 2\n",
            "While Loop iteration: 3\n",
            "While Loop iteration: 4\n",
            "While Loop iteration: 5\n",
            "\n",
            "Demo: Do-While Loop\n",
            "Do-While Loop iteration: 1\n",
            "Do-While Loop iteration: 2\n",
            "Do-While Loop iteration: 3\n",
            "Do-While Loop iteration: 4\n",
            "Do-While Loop iteration: 5\n",
            "\n",
            "Demo: For Loop with Range\n",
            "For Loop iteration: 1\n",
            "For Loop iteration: 2\n",
            "For Loop iteration: 3\n",
            "For Loop iteration: 4\n",
            "For Loop iteration: 5\n",
            "\n",
            "Demo: For Loop with Guards (only even numbers)\n",
            "Even number: 2\n",
            "Even number: 4\n",
            "Even number: 6\n",
            "Even number: 8\n",
            "Even number: 10\n",
            "\n",
            "Demo: For Loop with yield (creates a collection)\n",
            "Squares from 1 to 5: 1, 4, 9, 16, 25\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "#Scala CollectionDemo"
      ],
      "metadata": {
        "id": "OudeH3JqMwCQ"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "%%writefile CollectionDemo.scala\n",
        "object CollectionDemo {\n",
        "  def main(args: Array[String]): Unit = {\n",
        "    // List Example\n",
        "    val fruits = List(\"apple\", \"banana\", \"orange\")\n",
        "    println(\"List Example:\")\n",
        "    fruits.foreach(fruit => println(s\"Fruit: $fruit\"))\n",
        "\n",
        "    // Set Example\n",
        "    val numbers = Set(1, 2, 2, 3, 4)\n",
        "    println(\"\\nSet Example (duplicates removed):\")\n",
        "    numbers.foreach(num => println(s\"Number: $num\"))\n",
        "\n",
        "    // Map Example\n",
        "    val capitals = Map(\"France\" -> \"Paris\", \"Japan\" -> \"Tokyo\", \"India\" -> \"New Delhi\")\n",
        "    println(\"\\nMap Example:\")\n",
        "    capitals.foreach { case (country, capital) =>\n",
        "      println(s\"Capital of $country is $capital\")\n",
        "    }\n",
        "\n",
        "    // List - filtering and mapping\n",
        "    val squared = fruits.indices.map(i => i * i).toList\n",
        "    println(s\"\\nSquares of indices: ${squared.mkString(\", \")}\")\n",
        "\n",
        "    // Set - check existence\n",
        "    println(s\"\\nSet contains 3? ${numbers.contains(3)}\")\n",
        "    println(s\"Set contains 10? ${numbers.contains(10)}\")\n",
        "\n",
        "    // Map - get value by key\n",
        "    println(s\"\\nCapital of France: ${capitals.getOrElse(\"France\", \"Unknown\")}\")\n",
        "  }\n",
        "}"
      ],
      "metadata": {
        "id": "4Fl35kswLovW",
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "outputId": "2cd2af42-c61d-455f-98f4-60e89b316593"
      },
      "execution_count": 41,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Overwriting CollectionDemo.scala\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "!scalac CollectionDemo.scala"
      ],
      "metadata": {
        "id": "7VhoefgbOAo-"
      },
      "execution_count": 43,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "!scala CollectionDemo.scala"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "KHATOd8FOJln",
        "outputId": "65ae7d49-1e57-44a8-ac7d-f97d8d6e3851"
      },
      "execution_count": 44,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "List Example:\n",
            "Fruit: apple\n",
            "Fruit: banana\n",
            "Fruit: orange\n",
            "\n",
            "Set Example (duplicates removed):\n",
            "Number: 1\n",
            "Number: 2\n",
            "Number: 3\n",
            "Number: 4\n",
            "\n",
            "Map Example:\n",
            "Capital of France is Paris\n",
            "Capital of Japan is Tokyo\n",
            "Capital of India is New Delhi\n",
            "\n",
            "Squares of indices: 0, 1, 4\n",
            "\n",
            "Set contains 3? true\n",
            "Set contains 10? false\n",
            "\n",
            "Capital of France: Paris\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [],
      "metadata": {
        "id": "a4L4uHGiOQUI"
      },
      "execution_count": null,
      "outputs": []
    }
  ]
}